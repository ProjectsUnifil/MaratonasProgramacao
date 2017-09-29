
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class estudante implements Comparable {

	private int id;
	private String nome;
	private double cgpa;

	public estudante(int id, String nome, double cgpa) {
		this.id = id;
		this.nome = nome;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(Object o) {
		estudante est = (estudante) o;
		if (cgpa == est.cgpa) {
			if (nome.equals(est.nome)) {
				return id - est.id;
			} else {
				return nome.compareTo(est.nome);
			}
		} else {
			if (est.cgpa - cgpa > 0)
				return 1;
			else
				return -1;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<estudante> studentList = new ArrayList<estudante>();
		while (testCases > 0) {
			int id = in.nextInt();
			String nome = in.next();
			double cgpa = in.nextDouble();

			estudante st = new estudante(id, nome, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList);
		for (estudante st : studentList) {
			System.out.println(st.getNome());
		}
	}
}