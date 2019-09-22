
package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet(description = "ルーティングコントローラー", urlPatterns = { "/HealthCheck" })
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     *
     * @see HttpServlet#HttpServlet()
     */
    public HealthCheck() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String url = "/WEB-INF/jsp/healthCheck.jsp";
		var dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//JSPのテキストボックスから入力値を取得
		String weight = request.getParameter("weight");
		String height = request.getParameter("height");
		//JavaBeanを生成して値をセット
		var health = new Health();
		health.setWeight(Double.parseDouble(weight));
		health.setHeight(Double.parseDouble(height));

		var healthCheckLogic = new HealthCheckLogic();
		healthCheckLogic.execute(health);
		//リクエストスコープにJavaBeanを登録
		request.setAttribute("health", health);
		//フォワード
		final String url = "/WEB-INF/jsp/healthCheckResult.jsp";
		var dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
