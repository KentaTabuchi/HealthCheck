package model;

/**
 * @author tabuchikenta
 * BMIの計算とBMIの範囲から体型を算出するロジックモデル
 */
public class HealthCheckLogic {

	/**
	 * @param health
	 * 身長と体重だけが入力されているBeanを受け取り、BMIと体型をそのインスタンスにセットする。
	 */
	public void execute(Health health) {
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight / (height / 100.0 * height / 100.0);

		health.setBmi(bmi);

		String bodyType;
		if (bmi < 18.5) {
			bodyType = "痩せ型";
		} else if (bmi < 25) {
			bodyType = "普通";
		} else {
			bodyType = "肥満";
		}
		health.setBodyType(bodyType);
	}
}
