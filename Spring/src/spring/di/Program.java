package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		Exam exam = new NewlecExam(); // 부품
		ExamConsole console = new GridExamConsole(exam);
		console.setExam(exam); 
		 */ // 위 과정을 스프링이 해준다. 스프링에게 지시서를 넘겨준다(setting.xml을 통해서 지시)
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		// ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		// 꺼내는 방식 두가지

		console.print();
	}

}
