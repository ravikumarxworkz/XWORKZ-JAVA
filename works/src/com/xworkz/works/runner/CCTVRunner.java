package com.xworkz.works.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworkz.works.dto.CCTVDto;

public class CCTVRunner {

	public static void main(String[] args) {

		ArrayList<CCTVDto> cctvList = new ArrayList<CCTVDto>();

		cctvList.add(new CCTVDto("ABC Security Solutions", "XYZ-100", "1080p", 1000));
		cctvList.add(new CCTVDto("SecureCam Inc.", "GuardPro 2000", "4K Ultra HD p", 1500));
		cctvList.add(new CCTVDto("VisionTech Surveillance", "VisionGuard 500", "720p", 800));
		cctvList.add(new CCTVDto("EagleEye Systems", "EagleView 360", "1080p", 1200));
		cctvList.add(new CCTVDto("Watchful Eye Technologies", "Vigilant 720", "720p", 900));
		cctvList.add(new CCTVDto("Sentry Surveillance Solutions", "SentryPro 3000", "4K Ultra HD p", 1600));
		cctvList.add(new CCTVDto("Global Guardian CCTV", "GlobalWatch 1080", "1080p", 1100));
		cctvList.add(new CCTVDto("SecureVision Corp", "SecureCam 800", "720p", 850));
		cctvList.add(new CCTVDto("SmartSight Systems", "SmartView 4K", "4K Ultra HD p", 1700));
		cctvList.add(new CCTVDto("ClearView Surveillance", "ClearGuardian 720", "720p", 950));
		cctvList.add(new CCTVDto("EyeWatch Technologies", "EyeGuard 2000", "1080p", 1300));
		cctvList.add(new CCTVDto("Global Guardian CCTV", "GlobalWatch 1080", "1080p", 1100));
		cctvList.add(new CCTVDto("SafeZone Security Solutions", "SafeCam 720", "720p", 850));
		cctvList.add(new CCTVDto("UltraView Surveillance", "UltraVision 4000", "4K Ultra HD p", 1800));
		cctvList.add(new CCTVDto("WatchDog CCTV", "WatchTower 1080", "1080p", 1150));
		cctvList.add(new CCTVDto("TechGuard Security", "TechCam 720", "720p", 900));
		cctvList.add(new CCTVDto("OptiView Surveillance", "OptiGuard 2000", "1080p", 1350));
		cctvList.add(new CCTVDto("CitySafe Systems", "CityView 360", "1080p", 1250));
		cctvList.add(new CCTVDto("ProWatch CCTV Solutions", "ProView 720", "720p", 950));
		cctvList.add(new CCTVDto("Vigilance Surveillance", "VigilantEye 1080", "1080p", 1100));
		cctvList.add(new CCTVDto("SecureNet Technologies", "NetCam 720", "720p", 850));
		cctvList.add(new CCTVDto("SecureNet Technologies", "NetCam 720", "720p", 850));
		cctvList.add(new CCTVDto("SecureNet Technologies", "NetCam 720", "720p", 850));

		System.out.println("sort by ascending order");
		cctvList.stream().sorted(Comparator.comparing(CCTVDto::getCompanyName)).forEach(System.out::println);

		System.out.println("sort by distinct order");
		cctvList.stream().distinct().forEach(System.out::println);

		System.out.println("only matched dto");
		cctvList.stream().filter(CCTVDto -> CCTVDto.getPrice() == 850).forEach(System.out::println);

		System.out.println("matched with  'Technologies'");

		List<CCTVDto> filterCCtv = cctvList.stream()
				.filter(CCTVDto -> CCTVDto.getCompanyName().contains("Technologies")).collect(Collectors.toList());
		filterCCtv.forEach(System.out::println);
		System.out.println("star with 7");
		List<CCTVDto> starwith = cctvList.stream().filter(CCTVDto -> CCTVDto.getResolution().startsWith("7"))
				.collect(Collectors.toList());

		starwith.forEach(System.out::println);

		System.out.println(" end with a");
		List<CCTVDto> endidth = cctvList.stream().filter(CCTVDto -> CCTVDto.getResolution().endsWith("a"))
				.collect(Collectors.toList());

		endidth.forEach(System.out::println);

		Optional<CCTVDto> findfirst = cctvList.stream()
				.filter(CCTVDto -> CCTVDto.getCompanyName().equalsIgnoreCase("Global Guardian CCTV")).findFirst();

		System.out.println("find first=" + findfirst);

		Optional<CCTVDto> findany = cctvList.stream()
				.filter(CCTVDto -> CCTVDto.getCompanyName().equalsIgnoreCase("SecureNet Technologies")).findAny();

		System.out.println("find any=" + findany);

		boolean allmatch = cctvList.stream().allMatch(CCTVDto -> CCTVDto.getResolution().contains("p"));

		System.out.println("all match=" + allmatch);
	}

}
