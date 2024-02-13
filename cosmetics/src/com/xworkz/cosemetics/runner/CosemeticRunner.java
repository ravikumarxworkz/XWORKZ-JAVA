package com.xworkz.cosemetics.runner;

import java.util.ArrayList;

import com.xworkz.cosmetics.dto.CosmeticsDto;

public class CosemeticRunner {

	public static void main(String[] args) {

		ArrayList<CosmeticsDto> cosmeticsList = new ArrayList<>();

		CosmeticsDto eyeliner = new CosmeticsDto("Liquid Eyeliner", "Maybelline", "Eye Makeup", "Maybelline", 7.99, 50,
				"0.018 fl. oz.", "Black", "All skin types", "Water", "Waterproof", "2025-12-31", false, false, false);

		CosmeticsDto concealer = new CosmeticsDto("Concealer Stick", "L'Oréal Paris", "Face Makeup",
				"L'Oréal Paris True", 8.99, 30, "0.1 oz.", "Natural Beige", "All skin types", "Ethylhexyl", "Conceals",
				"2025-12-31", true, false, false);

		CosmeticsDto eyeshadow = new CosmeticsDto("Eyeshadow Palette", "Urban Decay", "Eye Makeup",
				"Urban Decay Naked3 Eyeshadow Palette, 12 Neutral Rose Shades - Ultra-Blendable, Rich Colors with Velvety Texture - Set Includes Mirror & Double-Ended Makeup Brush",
				54.00, 20, "12 x 0.05 oz.", "Neutral Rose", "All skin types",
				"Talc, Caprylic/Capric Triglyceride, Zinc Stearate, PTFE, Ethylene/Acrylic Acid Copolymer...",
				"Ultra-Blendable, Rich Colors with Velvety Texture", "2025-12-31", // Expiry date
				true, // Urban Decay is cruelty-free
				false, // Urban Decay's products are not vegan
				false);

		CosmeticsDto foundation = new CosmeticsDto("Liquid Foundation", "L'Oréal Paris", "Face Makeup",
				"L'Oréal Paris True Match Super Blendable Liquid Foundation, Lightweight, Natural Finish, Oil-Free, SPF 17, Non-Comedogenic, Hydrating Formula",
				12.99, 40, // Assuming 40 available units
				"1 fl. oz.", // Size of the product
				"Natural Beige", "All skin types",
				"Water, Dimethicone, Isododecane, Cyclohexasiloxane, Glycerin, PEG-10 Dimethicone, Methyl Methacrylate Crosspolymer...",
				"Lightweight, Natural Finish, Oil-Free, SPF 17", "2025-12-31", // Expiry date
				true, // L'Oréal Paris is cruelty-free
				false, // L'Oréal Paris's products are not vegan
				false);
		// Creating an example of a bronzer product
		CosmeticsDto bronzer = new CosmeticsDto("Bronzing Powder", "NARS", "Face Makeup",
				"NARS Laguna Bronzing Powder, Buildable Matte Finish, Diffused Bronzer with Gold Shimmer", 38.00, 25, // Assuming
																														// 25
																														// available
																														// units
				"0.28 oz.", // Size of the product
				"Laguna", "All skin types",
				"Talc, Mica, Ethylhexyl Palmitate, Nylon-12, Silica, Zinc Stearate, Polyethylene...",
				"Buildable Matte Finish, Diffused Bronzer with Gold Shimmer", "2025-12-31", true, // NARS is
																									// cruelty-free
				false, // NARS's products are not vegan
				false);

		cosmeticsList.add(bronzer);

		// Creating an example of a blush product
		CosmeticsDto blush = new CosmeticsDto("Powder Blush", "Milani", "Face Makeup",
				"Milani Baked Blush, Luminous Finish, Buildable Color, Includes Mirror & Brush", 9.49, 30, // Assuming
																											// 30
																											// available
																											// units
				"0.12 oz.", "Luminoso", "All skin types",
				"Mica, Talc, Dimethicone, Isopropyl Palmitate, Polysorbate 20, Acrylamide/Sodium Acryloyldimethyltaurate Copolymer...",
				"Luminous Finish, Buildable Color", "2025-12-31", true, true, false);
		CosmeticsDto primer = new CosmeticsDto("Face Primer", "Smashbox", "Face Makeup",
				"Smashbox Photo Finish Foundation Primer, Pore Minimizing, Oil-Free, Lightweight, Hydrating", 36.00, 20, // Assuming
				"1 fl. oz.", "Transparent", "All skin types",
				"Cyclopentasiloxane, Dimethicone, Dimethicone Crosspolymer, Trisiloxane, Silica, Dimethicone/Vinyl Dimethicone Crosspolymer...",
				"Pore Minimizing, Oil-Free, Lightweight, Hydrating", "2025-12-31", true, false, false);

		CosmeticsDto primer1 = new CosmeticsDto("Face Primer", "Smashbox", "Face Makeup",
				"Smashbox Photo Finish Foundation Primer, Pore Minimizing, Oil-Free, Lightweight, Hydrating", 36.00, 20,
				"1 fl. oz.", "Transparent", "All skin types",
				"Cyclopentasiloxane, Dimethicone, Dimethicone Crosspolymer, Trisiloxane, Silica, Dimethicone/Vinyl Dimethicone Crosspolymer...",
				"Pore Minimizing, Oil-Free, Lightweight, Hydrating", "2025-12-31", true, false, false);

	}
}
