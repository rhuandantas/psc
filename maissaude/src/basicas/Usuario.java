package basicas;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Usuario extends Pessoa{
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha;
}
