package com.xworkz.medicines.runner;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.function.Consumer;

import com.xworkz.medicines.dto.MedicinesDTO;

public class MedicinesMain {

	public static void main(String[] args) {

		LinkedList<MedicinesDTO> medicinesList = new LinkedList<>();

		medicinesList.add(new MedicinesDTO("Acetaminophen", "Pain Relief",
				"Acetaminophen is used to relieve mild to moderate pain from headaches, muscle aches, menstrual periods, colds, sore throats, toothaches, and to reduce fever.",
				5.99, 100, "Generic Manufacturer", "Tablet", "Pain relief, Fever reduction", "Nausea, Liver damage",
				"Liver disease, Alcoholism", "Do not exceed recommended dosage", "2024-12-31", false, true, true));
		medicinesList.add(new MedicinesDTO("Adderall", "ADHD Medication",
				"Adderall is used to treat attention deficit hyperactivity disorder (ADHD) and narcolepsy (a sleep disorder).",
				20.50, 50, "Brand Manufacturer", "Capsule", "ADHD Treatment", "Insomnia, Loss of appetite",
				"Heart disease, High blood pressure", "Do not take late in the day", "2024-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Amitriptyline", "Antidepressant",
				"Amitriptyline is used to treat depression. It may improve mood and feelings of well-being, relieve anxiety and tension, help you sleep better, and increase your energy level.",
				12.99, 50, "Generic Manufacturer", "Tablet", "Depression Treatment", "Drowsiness, Dry mouth",
				"Heart disease, Glaucoma", "Avoid alcohol", "2025-12-31", true, true, false));
		medicinesList.add(new MedicinesDTO("Amlodipine", "Antihypertensive",
				"Amlodipine is used with or without other medications to treat high blood pressure. Lowering high blood pressure helps prevent strokes, heart attacks, and kidney problems.",
				8.50, 30, "Generic Manufacturer", "Tablet", "Hypertension Treatment", "Swelling, Dizziness",
				"Liver disease", "Avoid grapefruit juice", "2025-12-31", true, true, true));
		medicinesList.add(new MedicinesDTO("Amoxicillin", "Antibiotic",
				"Amoxicillin is a penicillin antibiotic that fights bacteria. Amoxicillin is used to treat many different types of infection caused by bacteria, such as tonsillitis, bronchitis, pneumonia, and infections of the ear, nose, throat, skin, or urinary tract.",
				9.99, 40, "Generic Manufacturer", "Capsule", "Bacterial Infection Treatment", "Nausea, Diarrhea",
				"Mononucleosis", "Take with food or milk", "2025-12-31", true, true, false));
		medicinesList.add(new MedicinesDTO("Ativan", "Anxiolytic",
				"Ativan is used to treat anxiety disorders. It is also used for short-term relief of the symptoms of anxiety or anxiety caused by depression.",
				15.00, 20, "Brand Manufacturer", "Tablet", "Anxiety Treatment", "Drowsiness, Dizziness",
				"Severe respiratory insufficiency", "Avoid alcohol", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Atorvastatin", "Antihyperlipidemic",
				"Atorvastatin is used along with a proper diet to help lower cholesterol and fats (such as LDL, triglycerides) and raise cholesterol (HDL) in the blood.",
				7.99, 60, "Generic Manufacturer", "Tablet", "Cholesterol Management", "Muscle pain, Diarrhea",
				"Liver disease", "Avoid grapefruit juice", "2025-12-31", true, true, true));
		medicinesList.add(new MedicinesDTO("Azithromycin", "Antibiotic",
				"Azithromycin is used to treat a wide variety of bacterial infections. It is a macrolide-type antibiotic. It works by stopping the growth of bacteria.",
				10.50, 25, "Generic Manufacturer", "Tablet", "Bacterial Infection Treatment", "Nausea, Vomiting",
				"Liver disease", "Take on an empty stomach", "2025-12-31", true, true, false));
		medicinesList.add(new MedicinesDTO("Benzonatate", "Antitussive",
				"Benzonatate is used to relieve coughing. It works by reducing the cough reflex in the lungs that causes cough.",
				14.99, 35, "Generic Manufacturer", "Capsule", "Cough Relief", "Dizziness, Headache",
				"Hypersensitivity to benzonatate", "Swallow whole, do not chew", "2025-12-31", true, true, true));
		medicinesList.add(new MedicinesDTO("Cymbalta", "Antidepressant",
				"Cymbalta is used to treat depression and anxiety, and to relieve nerve pain caused by certain conditions (such as fibromyalgia, diabetic nerve problems).",
				25.99, 45, "Brand Manufacturer", "Capsule", "Depression and Anxiety Treatment",
				"Drowsiness, Constipation", "Liver disease", "Avoid alcohol", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Doxycycline", "Antibiotic",
				"Doxycycline is used to treat bacterial infections, including pneumonia and other respiratory tract infections; Lyme disease; acne; infections of skin, genital, and urinary systems; and anthrax (after inhalational exposure).",
				12.00, 50, "Generic Manufacturer", "Capsule", "Bacterial Infection Treatment", "Nausea, Diarrhea",
				"Liver disease", "Take with plenty of water", "2025-12-31", true, true, false));
		medicinesList.add(new MedicinesDTO("Wupixent", "Immunosuppressive",
				"Dupixent is used to treat moderate to severe eczema (atopic dermatitis) and moderate to severe asthma that is caused by certain types of allergies.",
				500.00, 10, "Brand Manufacturer", "Injection", "Eczema and Asthma Treatment",
				"Injection site reactions, Sore throat", "Hypersensitivity", "Administer under medical supervision",
				"2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Entresto", "Cardiovascular Agent",
				"Entresto is used to treat certain heart failure. It helps improve your ability to exercise and slow down the worsening of your condition.",
				100.00, 15, "Brand Manufacturer", "Tablet", "Heart Failure Treatment", "Hypotension, Cough",
				"Angioedema", "Take with or without food", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Zntyvio", "Immunosuppressive",
				"Entyvio is used to treat ulcerative colitis and Crohn's disease.", 2000.00, 5, "Brand Manufacturer",
				"Injection", "Ulcerative Colitis and Crohn's Disease Treatment",
				"Headache, Upper respiratory tract infections", "Hypersensitivity",
				"Administer under medical supervision", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Farxiga", "Antidiabetic",
				"Farxiga is used along with diet and exercise, and sometimes with other medications, to lower blood sugar levels in patients with type 2 diabetes (condition in which blood sugar is too high because the body does not produce or use insulin normally).",
				30.50, 40, "Brand Manufacturer", "Tablet", "Diabetes Management",
				"Urinary tract infection, Genital mycotic infection", "Kidney problems",
				"Take in the morning with or without food", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Fentanyl Patch", "Analgesic",
				"Fentanyl patch is used to relieve severe pain in people who are expected to need pain medication around the clock for a long time and who cannot be treated with other medications.",
				50.00, 20, "Generic Manufacturer", "Patch", "Severe Pain Management", "Dizziness, Drowsiness",
				"Respiratory depression", "Apply to clean, dry skin", "2025-12-31", true, true, true));
		medicinesList.add(new MedicinesDTO("Gabapentin", "Anticonvulsant",
				"Gabapentin is used with other medications to prevent and control seizures. It is also used to relieve nerve pain following shingles (a painful rash due to herpes zoster infection) in adults.",
				9.00, 60, "Generic Manufacturer", "Capsule", "Seizure Control and Nerve Pain Relief",
				"Dizziness, Drowsiness", "Kidney disease", "Take with or without food", "2025-12-31", true, true,
				false));
		medicinesList.add(new MedicinesDTO("Gilenya", "Immunomodulator",
				"Gilenya is used to treat relapsing forms of multiple sclerosis (MS) in adults and children who are at least 10 years old.",
				1500.00, 15, "Brand Manufacturer", "Capsule", "Multiple Sclerosis Treatment", "Headache, Diarrhea",
				"Liver disease", "Administer under medical supervision", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Humira", "Immunosuppressive",
				"Humira is used to treat many inflammatory conditions such as rheumatoid arthritis, psoriatic arthritis, ankylosing spondylitis, plaque psoriasis, and a skin condition called hidradenitis suppurativa.",
				1500.00, 10, "Brand Manufacturer", "Injection", "Inflammatory Condition Treatment",
				"Injection site reactions, Upper respiratory infections", "Hypersensitivity",
				"Administer under medical supervision", "2025-12-31", true, false, false));
		medicinesList.add(new MedicinesDTO("Hydrochlorothiazide", "Diuretic",
				"Hydrochlorothiazide is used to treat high blood pressure (hypertension). It is also used to treat fluid retention (edema) in people with congestive heart failure, cirrhosis of the liver, or kidney disorders, or edema caused by taking steroids or estrogen.",
				5.50, 45, "Generic Manufacturer", "Tablet", "Hypertension and Edema Treatment", "Dizziness, Headache",
				"Allergy to sulfa drugs", "Take with or without food", "2025-12-31", true, true, true));

		System.out.println("display all values");
		medicinesList.stream().forEach(s -> System.out.println(s));
		System.out.println("filter by name");
		medicinesList.stream().filter(medicine -> medicine.getName().equals("A"))
				.forEach(medicine -> System.out.println(medicine));
		System.out.println("filter name start with SA");
		medicinesList.stream().filter(v -> v.getName().contains("sa"))
				.forEach(medicine -> System.out.println(medicine));
		System.out.println("between to 5 to 15 dto");
		medicinesList.stream().skip(4).limit(16).forEach(medicine -> System.out.println(medicine));

		System.out.println("sorted order");
		medicinesList.stream().sorted(Comparator.comparing(MedicinesDTO::getName)).forEach(System.out::println);

		System.out.println("sorted distinct");

		medicinesList.stream().distinct().forEach(medicine -> System.out.println(medicine));

		System.out.println("reverse order");
		medicinesList.stream().sorted(Comparator.comparing(MedicinesDTO::getName).reversed())
				.forEach(System.out::println);
		System.out.println("all in one line");
		medicinesList.stream().sorted(Comparator.comparing(MedicinesDTO::getName)).skip(5).limit(12)
				.forEach(System.out::println);
	}
}