package com.controller;

import com.model.BookInfo;
import com.model.BorrowInfo;
import com.model.StudentInfo;
import com.service.BookInfoService;
import com.service.BorrowInfoService;
import com.service.StudentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main")
public class BookInfoController {

	@Autowired
	private BookInfoService bookInfoService;

	@Autowired
	private StudentInfoService studentInfoService;

	@Autowired
	private BorrowInfoService borrowInfoService;

	/**
	 * 功能：用于跳转图书录入页面
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toBookReg")
	public String toBookReg(HttpServletRequest request, HttpServletResponse response) {
		return "bookview/bookReg";
	}

	/**
	 * 功能：用于跳转图书借阅页面
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toBookBorrow")
	public String toBookBorrow(HttpServletRequest request, HttpServletResponse response) {
		return "bookview/bookReg";
	}

	/**
	 * 功能：用于跳转图书归还页面
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toBookReturn")
	public String toBookReturn(HttpServletRequest request, HttpServletResponse response) {
		return "bookview/bookReturn";
	}

	/**
	 * 功能：用于跳转借阅控制服务页面
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("toBorrowService")
	public String toBorrowService(HttpServletRequest request, HttpServletResponse response) {
		return "bookview/borrowService";
	}

	/**
	 * 功能：用于添加图书信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("addBook")
	public ModelAndView addBook(BookInfo bookInfo, HttpServletRequest request, HttpServletResponse response) {
		if (bookInfoService.insertBookInfo(bookInfo) > 0) {
			return new ModelAndView("bookview/bookReg", "result", "添加成功，可以继续添加");
		} else {
			return new ModelAndView("bookview/bookReg", "result",
					"添加失败，请检查输入内容或数据库连接");
		}
	}

	/**
	 * 功能：用于修改图书信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("modifyBook")
	public ModelAndView modifyBook(BookInfo bookInfo, HttpServletRequest request, HttpServletResponse response) {
		if (bookInfoService.insertBookInfo(bookInfo) > 0) {
			return listBook(request, response);
		} else {
			return new ModelAndView("bookview/bookReg", "result",
					"修改失败，请检查输入内容或数据库连接");
		}
	}

	/**
	 * 功能：用于显示图书信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("listBook")
	public ModelAndView listBook(HttpServletRequest request, HttpServletResponse response) {
		List list = bookInfoService.getAllBookInfo();
		return new ModelAndView("bookview/bookService", "result", list);
	}

	/**
	 * 功能：用于查询图书信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchBook")
	public ModelAndView searchBook(HttpServletRequest request, HttpServletResponse response) {
		List list;
		String condition = request.getParameter("condition");
		if (condition.equals("书号")) {
			condition = "bkiId";
		} else if (condition.equals("书名")) {
			condition = "bkiName";
		} else {
			condition = "bkiConcern";
		}
		String conditionContent = request.getParameter("conditionContent");
		list = bookInfoService.queryBookInfoByCondition(condition, conditionContent);
		return new ModelAndView("bookview/bookService", "result", list);
	}

	/**
	 * 功能：用于显示图书信息细目
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("detailBook")
	public ModelAndView detailBook(HttpServletRequest request, HttpServletResponse response) {
		String bkiId = request.getParameter("bkiId");
		BookInfo bki = bookInfoService.getBookInfoById(bkiId);
		return new ModelAndView("bookview/bookDetail", "result", bki);
	}

	/**
	 * 功能：用于显示图书借阅信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("borrowBook")
	public ModelAndView borrowBook(HttpServletRequest request, HttpServletResponse response) {
		String submit = request.getParameter("save");
		List list = null;
		Map model = null;
		StudentInfo sti = null;
		BookInfo bki = null;
		BorrowInfo bwi = null;
		String stiId = request.getParameter("stiId");
		String bkiId = request.getParameter("bkiId");
		if (stiId != null && !stiId.equals("")) {
			sti = studentInfoService.getStudentInfoById(stiId);
		}
		if (bkiId != null && !bkiId.equals("")) {
			bki = bookInfoService.getBookInfoById(bkiId);
		}
		if (sti != null) {
			bwi = borrowInfoService.getBorrowInfoByStudentId(sti.getStiId());
			model = new HashMap();
			model.put("sti", sti);
			model.put("bki", bki);
			model.put("bwi", bwi);
		}
		String price = request.getParameter("bkiPrice");
		if (submit != null && price != null && !price.equals("")) {
			bwi = new BorrowInfo();
			bwi.setBwiName(request.getParameter("bkiName"));
			bwi.setBookInfo(bki);
			bwi.setBwiType("bkiType");
			bwi.setBwiBorrowDate(new Date(System.currentTimeMillis()));
			bwi.setBwiCzy(request.getParameter("bkiCzy"));
			bwi.setStudentInfo(sti);
			bwi.setBwiPrice(Double.valueOf(price));

			borrowInfoService.insertBorrowInfo(bwi);
			bwi = borrowInfoService.getBorrowInfoByStudentId(sti.getStiId());

			model = new HashMap();
			model.put("sti", sti);
			model.put("bwi", bwi);
		}
		return new ModelAndView("bookview/bookBorrow", "info", model);
	}

	/**
	 * 功能：用于显示图书归还信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param res
	 * @return
	 */
	@RequestMapping("returnBook")
	public ModelAndView returnBook(HttpServletRequest request, HttpServletResponse res) {
		List list = null;
		Map model = null;
		StudentInfo sti = null;
		// BookInfo bki = null;
		BorrowInfo bwi = null;
		String submit = request.getParameter("return");
		String stiId = request.getParameter("stiId");
		String bkiId = request.getParameter("bkiId");
		if (stiId != null && stiId != "") {
			sti = studentInfoService.getStudentInfoById(stiId);
		}
		// if (bkiId != null && bkiId != "") {
		// list = null;
		// list = dao.queryObject("from BorrowInfo where
		// bki.bkiId='" + bkiId
		// + "'");
		// if (list != null && list.size() > 0)
		// bki = (BookInfo) list.get(0);
		// }
		if (sti != null && bkiId != null) {
			list = null;
			BorrowInfo _bwi = new BorrowInfo();
			_bwi.setStiId(sti.getStiId());
			_bwi.setBkiId(bkiId);
			list = borrowInfoService.queryBorrowInfoByParam(_bwi);
			if (list != null && list.size() > 0) {
				bwi = (BorrowInfo) list.get(0);
			}
		}
		if (submit != null && stiId != null) {// 如果是通过按钮提交，删除记录
			list = null;
			BorrowInfo _bwi = new BorrowInfo();
			_bwi.setStiId(sti.getStiId());
			_bwi.setBkiId(bkiId);
			list = borrowInfoService.queryBorrowInfoByParam(_bwi);
			if (list != null && list.size() > 0) {
				_bwi = (BorrowInfo) list.get(0);
				borrowInfoService.delBorrowInfoById(_bwi.getBwiId());
			}

			_bwi = borrowInfoService.getBorrowInfoByStudentId(stiId);
			System.out.println("submit list=" + _bwi);
			model = new HashMap();
			model.put("sti", sti);
			model.put("bwi", bwi);
			return new ModelAndView("bookview/bookReturn", "info", model);
		}

		BorrowInfo _bwi = borrowInfoService.getBorrowInfoByStudentId(stiId);
		model = new HashMap();
		model.put("sti", sti);
		// model.put("book", bookDetail);
		model.put("bwi", bwi);// 借阅表的信息
		model.put("list", _bwi);
		return new ModelAndView("bookview/bookReturn", "info", model);
	}

	/**
	 * 功能：用于查询图书借阅信息
	 * 实现：通过request请求参数中的stuid值来进行
	 *      判断学生ID是否存在
	 *
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("searchBorrow")
	public ModelAndView searchBorrow(HttpServletRequest request, HttpServletResponse response) {
		List list = null;
		String submit = request.getParameter("Submit");
		String showAll = request.getParameter("ShowAll");
		if (submit != null) {
			String conditionContent = request.getParameter("conditionContent");
			String condition = request.getParameter("condition");
			if (condition.equals("书号")) {
				condition = "bki.bkiId";
			} else if (condition.equals("学号")) {
				condition = "sti.stiId";
			} else {
				condition = "borrowDate";
			}
			if (!condition.equals("borrowDate")) {
				list = borrowInfoService.queryBorrowInfoByCondition(condition,conditionContent);
			} else {
//				list = dao.queryObject("from BorrowInfo where " + condition
//						+ " >= '" + conditionContent + " 00:00:00' and "
//						+ condition + " <= '" + conditionContent + " 23:59:59'");

				list = borrowInfoService.queryBorrowInfoByCondition(condition,conditionContent);
			}
			System.out.println(list.size());
		}
		if (showAll != null) {
			list = borrowInfoService.getAllBorrowInfo();
		}
		return new ModelAndView("bookview/borrowService", "list", list);
	}
}
