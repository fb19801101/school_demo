package com.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.model.StudentInfo;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Formatter;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-03-17 15:31
 */
public class DateSerializer {
    // 时间格式化
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

    /**
     * 全局化化时间格式配置(Converter)
     * org.springframework.core.convert.converter.Converter<S,T>
     * @return
     */
    @Bean
    public Converter<String, LocalDateTime> localDateConverter() {
        return new Converter<String, LocalDateTime>() {
            @Override
            public LocalDateTime convert(String source) {
                return LocalDateTime.parse(source, FORMATTER);
            }
        };
    }

    /**
     * 全局化化时间格式配置(Formatter)
     * org.springframework.format.Formatter<T>
     *
     * @return
     */
    @Bean
    public Formatter<LocalDateTime> localDateFormatter() {
        return new Formatter<LocalDateTime>() {
            @Override
            public LocalDateTime parse(String text, Locale locale) throws ParseException {
                return LocalDateTime.parse(text, FORMATTER);
            }

            @Override
            public String print(LocalDateTime object, Locale locale) {
                return object.format(FORMATTER);
            }
        };
    }

    /**
     * jackson对LocalDateTime进行序列化和反序列化
     *
     * @return
     */
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jackson2ObjectMapperBuilderCustomizer() {
        return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder
                // 反序列化
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeserializer(FORMATTER))
                // 序列化
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(FORMATTER));
    }

    /**
     * Date 序列化 为 JSON
     *
     * @return
     */
    @Bean
    public JsonSerializer<LocalDateTime> dateJsonSerializer() {
        return new JsonSerializer<LocalDateTime>() {
            @Override
            public void serialize(LocalDateTime localDateTime, JsonGenerator jg, SerializerProvider provider)
                    throws IOException, JsonProcessingException {
                jg.writeString(localDateTime.format(FORMATTER));
            }
        };
    }

    /**
     * JSON 反序列化 为 Date
     * 按照指定格式需要添加注解 @JsonSerialize(using = DateJsonSerializer.class)
     * json数据对Date类型时间进行格式化注解 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
     *
     * @return
     */
    @Bean
    public JsonDeserializer<LocalDateTime> dateJsonDeSerializer() {
        return new JsonDeserializer<LocalDateTime>() {
            @Override
            public LocalDateTime deserialize(JsonParser jp, DeserializationContext text) throws IOException, JsonProcessingException {
                return LocalDateTime.parse(jp.getText(), FORMATTER);
            }
        };
    }

    /**
     * StudentInfo 序列化 为 JSON
     * 按照指定格式需要添加注解 @JsonSerialize(using = DateJsonSerializer.class)
     * json数据对Date类型时间进行格式化注解 @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
     *
     * @return
     */
    @Bean
    public JsonSerializer<StudentInfo> studentJsonSerializer() {

        return new JsonSerializer<StudentInfo>() {
            @Override
            public void serialize(StudentInfo studentInfo, JsonGenerator jg, SerializerProvider provider)
                    throws IOException, JsonProcessingException {
                jg.writeStartObject();
                jg.writeStringField("stiId", studentInfo.getStiId());
                jg.writeStringField("stiName", studentInfo.getStiName());
                jg.writeStringField("stiSex", studentInfo.getStiSex());
                jg.writeNumberField("stiAge", studentInfo.getStiAge());
                jg.writeStringField("stiSfzh", studentInfo.getStiSfzh());
                DateConverter dc = new DateConverter();
                Date dt = studentInfo.getStiCsrq();
                jg.writeStringField("stiCsrq", dc.format(dt));
                jg.writeStringField("stiZzmm", studentInfo.getStiZzmm());
                jg.writeStringField("stiJtdh", studentInfo.getStiJtdh());
                jg.writeStringField("stiJtdz", studentInfo.getStiJtdz());
                jg.writeStringField("stiJkzk", studentInfo.getStiJkzk());
                jg.writeObjectField("courseInfos", studentInfo.getCourseInfos());
                jg.writeEndObject();
            }
        };
    }

    /**
     * JSON 反序列化 为 StudentInfo
     *
     * @return
     */
    @Bean
    public JsonDeserializer<StudentInfo> studentJsonDeSerializer() {

        return new JsonDeserializer<StudentInfo>() {
            @Override
            public StudentInfo deserialize(JsonParser jp, DeserializationContext text)
                    throws IOException, JsonProcessingException {
                JsonNode node = jp.getCodec().readTree(jp);

                String stiId = node.get("stiId").asText();
                String stiName = node.get("stiName").asText();
                String stiSex = node.get("stiSex").asText();
                Integer stiAge = (Integer) ((IntNode)node.get("stiAge")).numberValue();
                String stiSfzh = node.get("stiSfzh").asText();
                String stiCsrq = node.get("stiCsrq").asText();
                String stiZzmm = node.get("stiZzmm").asText();
                String stiJtdh = node.get("stiJtdh").asText();
                String stiJtdz = node.get("stiJtdz").asText();
                String stiJkzk = node.get("stiJkzk").asText();

                DateConverter dc = new DateConverter();
                return new StudentInfo(stiId, stiName, stiSex, stiAge, stiSfzh, dc.convert(stiCsrq), stiZzmm, stiJtdh, stiJtdz, stiJkzk);
            }
        };
    }
}
