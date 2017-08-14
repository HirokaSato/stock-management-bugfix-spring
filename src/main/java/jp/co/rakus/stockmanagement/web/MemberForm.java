package jp.co.rakus.stockmanagement.web;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * メンバー関連のリクエストパラメータが入るフォーム.
 * @author igamasayuki
 *
 */
public class MemberForm {
	/** 名前 */
	@NotBlank(message="名前を入力してください")
	private String name;
	/** メールアドレス */
	@NotBlank(message="メールアドレスを入力してください")
	@Email(message="Eメールの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードを入力してください")
	@Length(min=4,max=12,message="4文字以上12文字以内で入力して下さい")
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
