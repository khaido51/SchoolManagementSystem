package com.khai;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create room objects
		Room room1 = new Room();
		room1.roomId = "R01";
		room1.roomNumber = 111;

		Room room2 = new Room();
		room2.roomId = "R02";
		room2.roomNumber = 112;

		Room[] rooms = { room1, room2 };

		// Create semester objects
		Semester semester1 = new Semester();
		semester1.semesterId = "01";
		semester1.beignDate = "15/03/2023";
		semester1.endDate = "15/07/2023";

		Semester semester2 = new Semester();
		semester2.semesterId = "02";
		semester2.beignDate = "15/08/2023";
		semester2.endDate = "15/12/2023";

		Semester[] semesters = { semester1, semester2 };

		// Create Teacher Objects
		Teacher teacherDung = new Teacher();
		teacherDung.teacherId = "T01";
		teacherDung.teacherName = "Dung Nguyen";

		Teacher teacherJayden = new Teacher();
		teacherJayden.teacherId = "T02";
		teacherJayden.teacherName = "Jayden Tran";

		Teacher[] teachers = { teacherDung, teacherJayden };

	
		// Create class objects
		Class class10A1 = new Class();
		class10A1.classId = "A001";
		class10A1.name = "10A1";
		class10A1.room = room1;
		class10A1.teacher = teacherDung;

		Class class10A2 = new Class();
		class10A2.classId = "A002";
		class10A2.name = "10A2";
		class10A2.room = room2;
		class10A2.teacher = teacherJayden;

		Class[] classes = { class10A1, class10A2};
				
		// Create student object
		Student studentJohn = new Student();
		studentJohn.studentId = "012";
		studentJohn.studentName = "John Cao";
		studentJohn.classRoom = class10A1;

		Student studentTony = new Student();
		studentTony.studentId = "013";
		studentTony.studentName = "Tony Vu";
		studentTony.classRoom = class10A2;

		Student[] students = { studentJohn, studentTony };

		// Create Subject Objects
		Subject math = new Subject();
		math.subjectId = "m01";
		math.subjectName = "Math";

		Subject english = new Subject();
		english.subjectId = "e01";
		english.subjectName = "English";

		Subject literature = new Subject();
		literature.subjectId = "l01";
		literature.subjectName = "Literature";

		Subject history = new Subject();
		history.subjectId = "h01";
		history.subjectName = "History";

		Subject physic = new Subject();
		physic.subjectId = "p01";
		physic.subjectName = "Physic";

		Subject[] subjects = { math, english, literature, history, physic };

		// Create teacherHasSubject
		TeacherHasSubject subjectDetails1 = new TeacherHasSubject();
		subjectDetails1.teacher = teacherDung;
		subjectDetails1.subject = math;

		TeacherHasSubject subjectDetails2 = new TeacherHasSubject();
		subjectDetails2.teacher = teacherDung;
		subjectDetails2.subject = physic;

		TeacherHasSubject subjectDetails3 = new TeacherHasSubject();
		subjectDetails3.teacher = teacherJayden;
		subjectDetails3.subject = literature;

		TeacherHasSubject subjectDetails4 = new TeacherHasSubject();
		subjectDetails4.teacher = teacherJayden;
		subjectDetails4.subject = history;

		TeacherHasSubject subjectDetails5 = new TeacherHasSubject();
		subjectDetails5.teacher = teacherJayden;
		subjectDetails5.subject = english;

		TeacherHasSubject[] subjectDetails = { subjectDetails1, subjectDetails2, subjectDetails3, subjectDetails4,
				subjectDetails5 };

		// Create Exam Objects
		Exam mins15Test = new Exam();
		mins15Test.examId = "01";
		mins15Test.examName = "15 Minutes Test";
		mins15Test.examDate = "12/04/2023";

		Exam mins45Test = new Exam();
		mins45Test.examId = "02";
		mins45Test.examName = "45 MinutesTest";
		mins45Test.examDate = "16/04/2023";

		Exam midSemExam = new Exam();
		midSemExam.examId = "03";
		midSemExam.examName = "Mid Semester Exam";
		midSemExam.examDate = "15/05/2023";

		Exam endSemExam = new Exam();
		endSemExam.examId = "04";
		endSemExam.examName = "End Semester Exam";
		endSemExam.examDate = "12/07/2023";

		Exam[] exams = { mins15Test, mins45Test, midSemExam, endSemExam };

		// Create ExamDetails object
		ExamDetails johnMath = new ExamDetails();
		johnMath.exam = mins15Test;
		johnMath.student = studentJohn;
		johnMath.subject = math;
		johnMath.semester = semester1;
		johnMath.point = 7.5;
		johnMath.multiplication = johnMath.point * 1;

		ExamDetails johnMath1 = new ExamDetails();
		johnMath1.exam = mins45Test;
		johnMath1.student = studentJohn;
		johnMath1.subject = math;
		johnMath1.semester = semester1;
		johnMath1.point = 8;
		johnMath1.multiplication = johnMath1.point * 1;

		ExamDetails johnMath2 = new ExamDetails();
		johnMath2.exam = midSemExam;
		johnMath2.student = studentJohn;
		johnMath2.subject = math;
		johnMath2.semester = semester1;
		johnMath2.point = 6.5;
		johnMath2.multiplication = johnMath2.point * 2;

		ExamDetails johnMath3 = new ExamDetails();
		johnMath3.exam = endSemExam;
		johnMath3.student = studentJohn;
		johnMath3.subject = math;
		johnMath3.semester = semester1;
		johnMath3.point = 7.3;
		johnMath3.multiplication = johnMath3.point * 2;

		ExamDetails johnEng = new ExamDetails();
		johnEng.exam = mins15Test;
		johnEng.student = studentJohn;
		johnEng.subject = english;
		johnEng.semester = semester1;
		johnEng.point = 8.2;
		johnEng.multiplication = johnEng.point * 1;

		ExamDetails johnEng1 = new ExamDetails();
		johnEng1.exam = mins45Test;
		johnEng1.student = studentJohn;
		johnEng1.subject = english;
		johnEng1.semester = semester1;
		johnEng1.point = 7.1;
		johnEng1.multiplication = johnEng1.point * 1;

		ExamDetails johnEng2 = new ExamDetails();
		johnEng2.exam = midSemExam;
		johnEng2.student = studentJohn;
		johnEng2.subject = english;
		johnEng2.semester = semester1;
		johnEng2.point = 8.8;
		johnEng2.multiplication = johnEng2.point * 2;

		ExamDetails johnEng3 = new ExamDetails();
		johnEng3.exam = endSemExam;
		johnEng3.student = studentJohn;
		johnEng3.subject = english;
		johnEng3.semester = semester1;
		johnEng3.point = 6.6;
		johnEng3.multiplication = johnEng3.point * 2;

		ExamDetails johnLit = new ExamDetails();
		johnLit.exam = mins15Test;
		johnLit.student = studentJohn;
		johnLit.subject = literature;
		johnLit.semester = semester1;
		johnLit.point = 5.5;
		johnLit.multiplication = johnLit.point * 1;

		ExamDetails johnLit1 = new ExamDetails();
		johnLit1.exam = mins45Test;
		johnLit1.student = studentJohn;
		johnLit1.subject = literature;
		johnLit1.semester = semester1;
		johnLit1.point = 6.5;
		johnLit1.multiplication = johnLit1.point * 1;

		ExamDetails johnLit2 = new ExamDetails();
		johnLit2.exam = midSemExam;
		johnLit2.student = studentJohn;
		johnLit2.subject = literature;
		johnLit2.semester = semester1;
		johnLit2.point = 6.8;
		johnLit2.multiplication = johnLit2.point * 2;

		ExamDetails johnLit3 = new ExamDetails();
		johnLit3.exam = endSemExam;
		johnLit3.student = studentJohn;
		johnLit3.subject = literature;
		johnLit3.semester = semester1;
		johnLit3.point = 7.4;
		johnLit3.multiplication = johnLit3.point * 2;

		ExamDetails johnHistory = new ExamDetails();
		johnHistory.exam = mins15Test;
		johnHistory.student = studentJohn;
		johnHistory.subject = history;
		johnHistory.semester = semester1;
		johnHistory.point = 9;
		johnHistory.multiplication = johnHistory.point * 1;

		ExamDetails johnHistory1 = new ExamDetails();
		johnHistory1.exam = mins45Test;
		johnHistory1.student = studentJohn;
		johnHistory1.subject = history;
		johnHistory1.semester = semester1;
		johnHistory1.point = 8;
		johnHistory1.multiplication = johnHistory1.point * 1;

		ExamDetails johnHistory2 = new ExamDetails();
		johnHistory2.exam = endSemExam;
		johnHistory2.student = studentJohn;
		johnHistory2.subject = history;
		johnHistory2.semester = semester1;
		johnHistory2.point = 7.8;
		johnHistory2.multiplication = johnHistory2.point * 2;

		ExamDetails johnHistory3 = new ExamDetails();
		johnHistory3.exam = endSemExam;
		johnHistory3.student = studentJohn;
		johnHistory3.subject = history;
		johnHistory3.semester = semester1;
		johnHistory3.point = 8.2;
		johnHistory3.multiplication = johnHistory3.point * 2;

		ExamDetails johnPhysic = new ExamDetails();
		johnPhysic.exam = mins15Test;
		johnPhysic.student = studentJohn;
		johnPhysic.subject = physic;
		johnPhysic.semester = semester1;
		johnPhysic.point = 7;
		johnPhysic.multiplication = johnPhysic.point * 1;

		ExamDetails johnPhysic1 = new ExamDetails();
		johnPhysic1.exam = mins45Test;
		johnPhysic1.student = studentJohn;
		johnPhysic1.subject = physic;
		johnPhysic1.semester = semester1;
		johnPhysic1.point = 8.8;
		johnPhysic1.multiplication = johnPhysic1.point * 1;

		ExamDetails johnPhysic2 = new ExamDetails();
		johnPhysic2.exam = endSemExam;
		johnPhysic2.student = studentJohn;
		johnPhysic2.subject = physic;
		johnPhysic2.semester = semester1;
		johnPhysic2.point = 6.9;
		johnPhysic2.multiplication = johnPhysic2.point * 2;

		ExamDetails johnPhysic3 = new ExamDetails();
		johnPhysic3.exam = endSemExam;
		johnPhysic3.student = studentJohn;
		johnPhysic3.subject = physic;
		johnPhysic3.semester = semester1;
		johnPhysic3.point = 7.7;
		johnPhysic3.multiplication = johnHistory3.point * 2;

		ExamDetails[] examDetails = { johnMath, johnMath1, johnMath2, johnMath3, johnEng, johnEng1, johnEng2, johnEng3,
				johnLit, johnLit1, johnLit2, johnLit3, johnHistory, johnHistory1, johnHistory2, johnHistory3,
				johnPhysic, johnPhysic1, johnPhysic2, johnPhysic3 };

		for (Student student : students) {
			double dtb = 0;
			double mathGrade = 0;
			double engGrade = 0;
			double litGrade = 0;
			double hisGrade = 0;
			double phyGrade = 0;
			System.out.println("Student Name: " + student.studentName);
			System.out.println("Class: " + student.classRoom.name);
			
			for(Class classRoom: classes) {
				if(classRoom.classId.equals(student.classRoom.classId)){
					System.out.println("Primary Teacher: " + classRoom.teacher.teacherName);
					
					for (Subject subject : subjects) {
						double averagePoint = 0;
						double total = 0;
						System.out.println("Subject: " + subject.subjectName);
						
						for (ExamDetails examDetail : examDetails) {
							if ((student.studentId.equals(examDetail.student.studentId))
									&& subject.subjectId.equals(examDetail.subject.subjectId)) {
								
								System.out.println(examDetail.exam.examName + " -- Point: " + examDetail.point);
								averagePoint += examDetail.multiplication;
								examDetail.grade = averagePoint / 6;
								total = examDetail.grade;

							}
						}
						System.out.println("------");
						System.out.println("Average Point is: " + Math.round(total * 100.0) / 100.0);
						System.out.println("------");
						System.out.println();

						if (subject.subjectName.equalsIgnoreCase("Math")) {
							mathGrade = total;
						}
						if (subject.subjectName.equalsIgnoreCase("English")) {
							engGrade = total;
						}
						if (subject.subjectName.equalsIgnoreCase("Literature")) {
							litGrade = total;
						}
						if (subject.subjectName.equalsIgnoreCase("History")) {
							hisGrade = total;
						}
						if (subject.subjectName.equalsIgnoreCase("Physic")) {
							phyGrade = total;
						}

						dtb = ((engGrade + mathGrade + litGrade) * 2 + hisGrade + phyGrade) / 8;
					}
				}
			}
		
			System.out.println("The final grade of all subject is: " + Math.round(dtb * 100.0) / 100.0);
			if(dtb > 8) {
				System.out.println("Excelent Student");
			}
			else if(dtb > 7 ) {
				System.out.println("Good Student");
			}
			else if(dtb > 6) {
				System.out.println("Average Student");
			}
			else if(dtb > 5) {
				System.out.println("Not Bad Student");
			}
			else {
				System.out.println("Failed");
			}
			System.out.println();
		}

	}
}
