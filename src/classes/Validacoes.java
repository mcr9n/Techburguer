/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.regex.Pattern;

/**
 *
 * @author dapedu
 */
public class Validacoes {
        //valida o formato das entradas
	public static boolean isCPF(String cpf) {
		boolean isCpf = Pattern.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\-[0-9]{2}", cpf);
		return isCpf;
	}

	public static boolean isData(String data) {
		boolean isData = Pattern.matches("^(((0[1-9]|[12][0-9]|3[01])[- /.](0[13578]|1[02])|(0[1-9]|[12][0-9]|30)[- /.](0[469]|11)|(0[1-9]|1\\d|2[0-8])[- /.]02)[- /.]\\d{4}|29[- /.]02[- /.](\\d{2}(0[48]|[2468][048]|[13579][26])|([02468][048]|[1359][26])00))$", data);
		return isData;
	}

	public static boolean isEmpty(String text) {
		if (text.equals("")) {
			return true;
		}
		return false;
	}

}
