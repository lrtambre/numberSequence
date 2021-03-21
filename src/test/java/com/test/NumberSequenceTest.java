package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberSequenceTest {

	public static final String NO_SEQUENCE = "NO SEQUENCE";

	public NumberSequenceTest() {
	}

	@Test
	public void test_Neg1() {
		int number = -1;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}
	@Test
	public void test_Neg5() {
		int number = -5;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}
	@Test
	public void test_Neg10() {
		int number = -10;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}
	@Test
	public void test_Neg15() {
		int number = -15;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_0() {
		int number = 0;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_1() {
		int number = 1;
		NumberSequence tree = new NumberSequence(number);

		assertEquals("1", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_2() {
		int number = 2;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_3() {
		int number = 3;
		NumberSequence tree = new NumberSequence(number);

		assertEquals("1->3", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_4() {
		int number = 4;
		NumberSequence tree = new NumberSequence(number);

		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_6() {
		int number = 6;
		NumberSequence tree = new NumberSequence(number);

		assertEquals("1->6", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_7() {
		int number = 7;
		NumberSequence tree = new NumberSequence(number);
		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_8() {
		int number = 8;
		NumberSequence tree = new NumberSequence(number);

		assertEquals("1->3->8", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_13() {
		int number = 13;
		NumberSequence tree = new NumberSequence(number);

		assertEquals("1->3->8->13", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_18() {
		int number = 18;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->8->13->18", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_29() {
		int number = 29;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->9->14->19->24->29", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_100() {
		int number = 100;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_500() {
		int number = 500;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

	@Test
	public void test_729() {
		int number = 729;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->9->27->81->243->729", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_754() {
		int number = 754;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->9->27->81->243->729->734->739->744->749->754", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_2197() {
		int number = 2197;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->9->27->81->243->729->2187->2192->2197", tree.printSequence(tree.root, number));
	}

	@Test
	public void test_3207() {
		int number = 3207;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals("1->3->9->27->81->243->729->2187->2192->2197->2202->2207->2212->2217->2222->"
				+ "2227->2232->2237->2242->2247->2252->2257->2262->2267->2272->2277->2282->2287->2292->"
				+ "2297->2302->2307->2312->2317->2322->2327->2332->2337->2342->2347->2352->2357->2362->"
				+ "2367->2372->2377->2382->2387->2392->2397->2402->2407->2412->2417->2422->2427->2432->"
				+ "2437->2442->2447->2452->2457->2462->2467->2472->2477->2482->2487->2492->2497->2502->"
				+ "2507->2512->2517->2522->2527->2532->2537->2542->2547->2552->2557->2562->2567->2572->"
				+ "2577->2582->2587->2592->2597->2602->2607->2612->2617->2622->2627->2632->2637->2642->"
				+ "2647->2652->2657->2662->2667->2672->2677->2682->2687->2692->2697->2702->2707->2712->"
				+ "2717->2722->2727->2732->2737->2742->2747->2752->2757->2762->2767->2772->2777->2782->"
				+ "2787->2792->2797->2802->2807->2812->2817->2822->2827->2832->2837->2842->2847->2852->"
				+ "2857->2862->2867->2872->2877->2882->2887->2892->2897->2902->2907->2912->2917->2922->"
				+ "2927->2932->2937->2942->2947->2952->2957->2962->2967->2972->2977->2982->2987->2992->"
				+ "2997->3002->3007->3012->3017->3022->3027->3032->3037->3042->3047->3052->3057->3062->"
				+ "3067->3072->3077->3082->3087->3092->3097->3102->3107->3112->3117->3122->3127->3132->"
				+ "3137->3142->3147->3152->3157->3162->3167->3172->3177->3182->3187->3192->3197->3202->" + "3207",
				tree.printSequence(tree.root, number));
	}

	//Process Not as efficient as we test larger numbers
	@Test
	public void test_3215() {
		int number = 3215;
		NumberSequence tree = new NumberSequence(number);
		;
		assertEquals(NO_SEQUENCE, tree.printSequence(tree.root, number));
	}

}
