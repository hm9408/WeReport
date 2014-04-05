package Mundo;

//----------
// NIP
// Proyecto: Protect-Block
// Clase: Usuario
// Version: 0.1
// Creador: Alejandro Lovera - 23/09/2013
// Modificado: 23/09/2013
//----------

/**
 * Clase que modelar� los atributos y m�todos necesarios de un Usuario en el sistema
 * @author Messie
 */
public class Usuario {

	//----------
	// Atributos
	//----------
	
	/**
	 * Atributo modelador del nombre real del usuario
	 */
	private String nombre;
	
	/**
	 * Atributo modelador del apellido real del usuario
	 */
	private String apellido;
	
	/**
	 * Atributo modelador del username del usuario
	 */
	private String username;
	
	/**
	 * Atributo modelador del correo electronico asociado al username del usuario
	 */
	private String correo;
	
	/**
	 * Atributo modelador del password asociado al username del usuario
	 */
	private String password;
	
	//----------
	// Constructor
	//----------
	
	/**
	 * Constructor de un nuevo Usuario dados sus par�metros
	 * @param nombre - nombre del nuevo usuario; nombre != null
	 * @param apellido - apellido del nuevo usuario; apellido != null
	 * @param username - username del usuario; username != null
	 * @param correo - correo del usuario; correo != null
	 * @param password - password del usuario; password != null
	 */
	public Usuario (String nombre, String apellido, String username, String correo, String password){
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.correo = correo;
		this.password = password;
	}
	
	//----------
	// M�todos
	//----------
	
	/**
	 * M�todo que devuelve el nombre del usuario
	 * @return nombre del usuario
	 */
	public String darNombre(){
		return nombre;
	}
	
	/**
	 * M�todo que devuelve el apellido del usuario
	 * @return apellido del usuario
	 */
	public String darApellido(){
		return apellido;
	}
	
	/**
	 * M�todo que devuelve el username del usuario
	 * @return username del usuario
	 */
	public String darUsername(){
		return username;
	}
	
	/**
	 * M�todo que devuelve el correo del usuario
	 * @return correo del usuario
	 */
	public String darCorreo(){
		return correo;
	}
	
	/**
	 * M�todo que devuelve el password del usuario
	 * @return password del usuario
	 */
	public String darPassword(){
		return password;
	}
	
	/**
	 * M�todo que cambia el nombre del usuario
	 * @param nombre - nuevo nombre del usuario
	 */
	public void cambiarNombre(String nombre){
		this.nombre = nombre;
	}
	
	/**
	 * M�todo que cambia el apellido del usuario
	 * @param apellido - nuevo apellido del usuario
	 */
	public void cambiarApellido(String apellido){
		this.apellido = apellido;
	}
	
	/**
	 * M�todo que cambia el username del usuario
	 * @param username - nuevo username del usuario
	 */
	public void cambiarUsername(String username){
		this.username = username;
	}
	
	/**
	 * M�todo que cambia el correo del usuario
	 * @param correo - nuevo correo del usuario
	 */
	public void cambiarCorreo(String correo){
		this.correo = correo;
	}
	
	/**
	 * M�todo que cambia el password del usuario
	 * @param password - nuevo password del usuario
	 */
	public void cambiarPassword(String password){
		this.password = password;
	}
	
}
