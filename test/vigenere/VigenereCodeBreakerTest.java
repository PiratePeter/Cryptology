package vigenere;

import static vigenere.Alphabet.*;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import vigenere.VigenereCodeBreaker;
import vigenere.VigenereCryptographer;

public final class VigenereCodeBreakerTest {

	// Keywords
	private final String keywordOne = prepareText(GERMAN, "Vignere");
	private final String keywordTwo = prepareText(GERMAN, "AlexanderPeter");
	private final String keywordThree = prepareText(ENGLISH, "secret");

	// Plain texts
	private final String plainTextFour = prepareText(GERMAN,
			"Diese würden Sachen der ihm getreten, feindselig Buch und konnte Ihrem, Arbeitslose einer Angriff sich die. Vernetzung gelobt wieder Glück wichtiger, zeigte bekämen der so vom und zu getreten, wenn war halb nach ersten, daß dem abseits zu einsehen verschwand in sprach einsehen dadurch Werten zustande allen, wie aber Nase gegenwärtigen Woche, als von Rechte noch sozialen Franz weder geringe, sagte das die Raum Schemel mit. Lassen Tür außer mit wollte sie. Man für man nötig standen, noch er die hierbleiben wie irgendeine wenigen. Lassen frühen Arme sah zuversichtlich, wie und nicht bedeutend seine. Was versehen einer verleugnet es. Ich der für in für, denn Freunden Internet dem Kleidung. Nach der zugänglich wurden zu sah, die Prozesse Staaten Reiben möglich Software köstlichen, wohl bloß andern müssen einem seine, die und er technische ihm, Schnallen wieder bei ihr seinem. Die erfasste her aufatmend Unterschied unternehmerisch, und schien war ist die, tatsächlich hatte der nur plötzlich laut. Die als alte ein die und, wenn hatte war wieder Stock mit. eine Blick sich war sagen ausdehnende hier zusammen sich mitlachen Kamins, sagte zog in sie es. Lassen mit hip dann dazu das. Besonders Sarah und ging und. Dies des schmuddelig das Internet verließ mit, allgemeinen unternehmerisch aus wieder eines Lage speisten. Er weltpolitische Falten meisten noch ausdehnende Zigarette. Nach von an nicht gewesen Faktor, blieb gleich Schlimmste neigte einer, und Kultur ihm langen sie saß das beinahe Jahr, als Betriebe wird Tage Hand und, und wild nicht bleiche diesem in, was Tode ihnen auch eines Kriterien, besonders auf war Absage und so er einer, knochiges eines Biergenusses weder Börse ganz zuvor. Er des werden Kohlen nun wagte ist. Wollen Jahre Ankunft als und geführt einer Vorschrift hoffe, Porzellan dadurch Kleidung von aufnahm flüsterte, dessen Bewegungen dem ihr Thomas. Böser irgendeine platzen Frau Michael einer, so nicht küßte können Unwillkürlich Atmens. Man für planlos er geben mit Markus Unternehmen Mann halten glauben saß, es beteiligt können Netzwelten hatten beherrschte. Sofort nach an sterben einem, so selbst auch veranstaltet Kommunikation Haferschleim Wesen Internet. Aber pensioniert starke ziemlich war die Hat wollte Gesellschaft. Dies auch wahr ermöglichten aufgeheitertes, entschlossen eintrat ausreichend mit deshalb Blatt handeln sich. Ihr die Armenhauses ein lautstarken. Ich miteinander Vorgang er mit Sachen Namens, die Erinnerung so die eigentlich infolgedessen hatte war, die außer mit die daß beobachtete, Kommunikation Widerspruch ließ Zimmer sozialen sich. Das Ausruf erfahren zu des, schaute hat nahm gesprungen verlebt, es Vorstellungen und beim die. Das das Gewohnheit berühmtes geschehen bald Ausdruck, den großer kommen den für. Jung sein noch Freundlichkeit nicht. Für die ihn wollte jetzt es weit begreifend, als nötig Internet setzte ausgerungen, dessen alte Hungern wenig Werten an. Besonders zwar jung Zigarette meisten Methoden nun, es traditionelle Tag eigentlich die endlich, aber Existenz für von Börsenwerte er heute, dann gesagt sprechen mit weitere er den er zu setzte ohnmächtig, es Bewegung Wächters gehen frühen. Olaf das man Profite Frau. Von möglich Spaß als und, entschlossen den sich für nichts, sah Zimmervermieterin Frühstück als ihm.");
	private final String plainTextFive = prepareText(GERMAN,
			"Lassen gegenueberliegenden betrachtete gebeugte dann. Seine besass Medien Gesellschaft Naehe gleich um Bruders, ihn bereiteten aufrecht Neugierde kleinen. Die einer Kirchen hatte hoert jetzt sich benebelt einzigen, dass dient ueber moechte leuchteten stand er, wobei sich koennen ueberlegung wird. Als war ich doch ich erst, noch des verkauft fluesterte nicht. Wer eines Abends ueber gehen ueber Worte. Ohne koennen wieder und Telefonrechnungen gebannt und. Sie womoeglich mit wird mit ein, um Netz und entscheidet wirkte, entschlossen aufrecht sich Arzt er, Decken Unterschleife weiterhin wohnte haben ging war, die den und die ohnmaechtig Zeit Profite, erblickte Vorsorge blossem geniessen den, die nennen zu Ruecksicht ungewoehnlichen nun, nachdem Jahren Ausdruck er weit von Chancen, durch eine eines warum Personen und, eine er in die besonders die bemitleidet, um diesem kleines spaeter Internet. Mit Gefahr aus Schimpfwort Arzt es er, in Information man alle Hause. Die Leser einer aus Handschuhe Ihnen, sagte entschieden auf fuer aus einem, trat kuesste Front Leuten verziehen, als erkannte Blicken den hierbleiben. Er Einfluessen sich Geburten wenig auch noch. Trotzdem zu Investitionen geringste die Arzt Ganze die so Zeit anerkannte. Nach und ausser Vorteil Fenster. Jemand unbedeutende blickenden will ein, die der Ausruf nun treffen und, wahrscheinlich die beinahe fuer Vorgeschichte es. Der Armenhauses dichten wurde Jahre erblickte niedrigem Anordnung, sondern ihrer war in hatte mit scharf Wohnungen Blick einer. Er moechte bald Netzwelten durch schicken. Der Namen Absage einem anders der. So Anstrengungen den Helga Mutter. Ich war der stand Entwicklung. Ihr zu Bett zu ausser. Beate Wesen einer eine weit seit Gefuehl Computer, woher Vielfalt Frau wuchs ansehen arme wieder diesmal daheim, ihn wenigen zwischen seine der, zumindest Nase einem war niemand. Olaf dem in haeufig die folgte ich. Da Nachthemd Zustimmung Ausdruck letzten, die neu auch diesen Depot, woher beugte verliess Fruehstueck der gewesen Maerkte, Arbeitslose Welt und wurden Technologien in, keine das neuen Aufgaben ungernein, wenn so erinnerte Uhr Mutter Elemente eine, ihn die fuer seine Jahren und. Schliesslich gesprungen von bedaechtig freundschaftlich die, Medien auch Gesellschaft Kinderzeug den sie, dann Welt hinter Entstehen Blatt, als nicht an einer kleiden. Das bebenden dem Familie bleiche zu wagte und beim des Sinn die sich langweilige, sank Stimme sich Projekt im pensioniert verbesserten starke, die zu zustande Pleite vermittelte, die jenen aerzten das stiess, dessen Stimme hatte sich dem ihre. Der Waechter fand Rock zurede muessen schon Chiffre. Dieses Industrien warten Frage erfasste Jahr, unterstuetzt innerhalb der das lachen Medien der Stock hatte, sagte sie gepflegt Nase dann und. Seine das Armenhauses gewissen der. Gehen immer verantwortlich die weit am, zu Depot war sagte von, denn seine fuer er Frau waehrend. Der Andeutungen Schauer er die. Er fuer sieht wollte sie, aber im die des zu geringe, sondern unzweifelhaft eines und anziehen. Diese er wurde unbedeutende musste. Sie zugeben gegenueber erdichteten Kommunikation anderen, es will in schreit so Computer, wie allen aber hob waee. Gute den grauen die voneinander geringste das. Ohne meinen rund nicht zurueckgeben den assoziiert, insbesondere werden er Schimpfwort werden. Sie alte sich diesem.");
	private final String plainTextSix = prepareText(ENGLISH,
			"Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversations?’ So she was considering in her own mind (as well as she could, for the hot day made her feel very sleepy and stupid), whether the pleasure of making a daisy-chain would be worth the trouble of getting up and picking the daisies, when suddenly a White Rabbit with pink eyes ran close by her. There was nothing so very remarkable in that; nor did Alice think it so very much out of the way to hear the Rabbit say to itself, ‘Oh dear! Oh dear! I shall be late!’ (when she thought it over afterwards, it occurred to her that she ought to have wondered at this, but at the time it all seemed quite natural); but when the Rabbit actually took a watch out of its waistcoat-pocket, and looked at it, and then hurried on, Alice started to her feet, for it flashed across her mind that she had never before seen a rabbit with either a waistcoat-pocket, or a watch to take out of it, and burning with curiosity, she ran across the field after it, and fortunately was just in time to see it pop down a large rabbit-hole under the hedge. In another moment down went Alice after it, never once considering how in the world she was to get out again. The rabbit-hole went straight on like a tunnel for some way, and then dipped suddenly down, so suddenly that Alice had not a moment to think about stopping herself before she found herself falling down a very deep well. Either the well was very deep, or she fell very slowly, for she had plenty of time as she went down to look about her and to wonder what was going to happen next. First, she tried to look down and make out what she was coming to, but it was too dark to see anything; then she looked at the sides of the well, and noticed that they were filled with cupboards and book-shelves; here and there she saw maps and pictures hung upon pegs. She took down a jar from one of the shelves as she passed; it was labelled ‘ORANGE MARMALADE’, but to her great disappointment it was empty: she did not like to drop the jar for fear of killing somebody, so managed to put it into one of the cupboards as she fell past it. ‘Well!’ thought Alice to herself, ‘after such a fall as this, I shall think nothing of tumbling down stairs! How brave they’ll all think me at home! Why, I wouldn’t say anything about it, even if I fell off the top of the house!’ (Which was very likely true.) Down, down, down. Would the fall never come to an end! ‘I wonder how many miles I’ve fallen by this time?’ she said aloud. ‘I must be getting somewhere near the centre of the earth. Let me see: that would be four thousand miles down, I think—’ (for, you see, Alice had learnt several things of this sort in her lessons in the schoolroom, and though this was not a very good opportunity for showing off her knowledge, as there was no one to listen to her, still it was good practice to say it over) ‘—yes, that’s about the right distance—but then I wonder what Latitude or Longitude I’ve got to?’ (Alice had no idea what Latitude was, or Longitude either, but thought they were nice grand words to say.) Presently she began again. ‘I wonder if I shall fall right through the earth! How funny it’ll seem to come out among the people that walk with their heads downward! The Antipathies, I think—’ (she was rather glad there was no one listening, this time, as it didn’t sound at all the right word) ‘—but I shall have to ask them what the name of the country is, you know. Please, Ma’am, is this New Zealand or Australia?’ (and she tried to curtsey as she spoke—fancy curtseying as you’re falling through the air! Do you think you could manage it?) ‘And what an ignorant little girl she’ll think me for asking! No, it’ll never do to ask: perhaps I shall see it written up somewhere.’ Down, down, down. There was nothing else to do, so Alice soon began talking again. ‘Dinah’ll miss me very much to-night, I should think!’ (Dinah was the cat.) ‘I hope they’ll remember her saucer of milk at tea-time. Dinah my dear! I wish you were down here with me! There are no mice in the air, I’m afraid, but you might catch a bat, and that’s very like a mouse, you know. But do cats eat bats, I wonder?’ And here Alice began to get rather sleepy, and went on saying to herself, in a dreamy sort of way, ‘Do cats eat bats? Do cats eat bats?’ and sometimes, ‘Do bats eat cats?’ for, you see, as she couldn’t answer either question, it didn’t much matter which way she put it. She felt that she was dozing off, and had just begun to dream that she was walking hand in hand with Dinah, and saying to her very earnestly, ‘Now, Dinah, tell me the truth: did you ever eat a bat?’ when suddenly, thump! thump! down she came upon a heap of sticks and dry leaves, and the fall was over. Alice was not a bit hurt, and she jumped up on to her feet in a moment: she looked up, but it was all dark overhead; before her was another long passage, and the White Rabbit was still in sight, hurrying down it. There was not a moment to be lost: away went Alice like the wind, and was just in time to hear it say, as it turned a corner, ‘Oh my ears and whiskers, how late it’s getting!’ She was close behind it when she turned the corner, but the Rabbit was no longer to be seen: she found herself in a long, low hall, which was lit up by a row of lamps hanging from the roof. There were doors all round the hall, but they were all locked; and when Alice had been all the way down one side and up the other, trying every door, she walked sadly down the middle, wondering how she was ever to get out again. Suddenly she came upon a little three-legged table, all made of solid glass; there was nothing on it except a tiny golden key, and Alice’s first thought was that it might belong to one of the doors of the hall; but, alas! either the locks were too large, or the key was too small, but at any rate it would not open any of them. However, on the second time round, she came upon a low curtain she had not noticed before, and behind it was a little door about fifteen inches high: she tried the little golden key in the lock, and to her great delight it fitted! Alice opened the door and found that it led into a small passage, not much larger than a rat-hole: she knelt down and looked along the passage into the loveliest garden you ever saw. How she longed to get out of that dark hall, and wander about among those beds of bright flowers and those cool fountains, but she could not even get her head through the doorway; ‘and even if my head would go through,’ thought poor Alice, ‘it would be of very little use without my shoulders. Oh, how I wish I could shut up like a telescope! I think I could, if I only knew how to begin.’ For, you see, so many out-of-the-way things had happened lately, that Alice had begun to think that very few things indeed were really impossible. There seemed to be no use in waiting by the little door, so she went back to the table, half hoping she might find another key on it, or at any rate a book of rules for shutting people up like telescopes: this time she found a little bottle on it, (‘which certainly was not here before,’ said Alice,) and round the neck of the bottle was a paper label, with the words ‘DRINK ME’ beautifully printed on it in large letters. It was all very well to say ‘Drink me,’ but the wise little Alice was not going to do that in a hurry. ‘No, I’ll look first,’ she said, ‘and see whether it’s marked “poison” or not’; for she had read several nice little histories about children who had got burnt, and eaten up by wild beasts and other unpleasant things, all because they would not remember the simple rules their friends had taught them: such as, that a red-hot poker will burn you if you hold it too long; and that if you cut your finger very deeply with a knife, it usually bleeds; and she had never forgotten that, if you drink much from a bottle marked ‘poison,’ it is almost certain to disagree with you, sooner or later. However, this bottle was not marked ‘poison,’ so Alice ventured to taste it, and finding it very nice, (it had, in fact, a sort of mixed flavour of cherry-tart, custard, pine-apple, roast turkey, toffee, and hot buttered toast,) she very soon finished it off.");

	// Cipher texts
	private final VigenereCryptographer cryptOne = new VigenereCryptographer(keywordOne);
	private final VigenereCryptographer cryptTwo = new VigenereCryptographer(keywordTwo);
	private final VigenereCryptographer cryptThree = new VigenereCryptographer(keywordThree);
	private final String ciphertextOneFour = cryptOne.encipherText(plainTextFour);
	private final String ciphertextTwoFive = cryptTwo.encipherText(plainTextFive);
	private final String ciphertextThreeSix = cryptThree.encipherText(plainTextSix);

	// Breakers

	private final VigenereCodeBreaker germanBreaker = new VigenereCodeBreaker(GERMAN);
	private final VigenereCodeBreaker englishBreaker = new VigenereCodeBreaker(ENGLISH);

	@Test
	public void testAnalyzePerColumnWithMultipleColumns() {
		int numberOfColumns = 19;
		char[] result = germanBreaker.getMostFrequentLetterPerColumn(plainTextFour.toCharArray(), numberOfColumns);
		assertEquals("wrong length", numberOfColumns, result.length);
		for (int i = 0; i < result.length; i++) {
			assertEquals("most frequent letter in german should be 'e'", 'e', result[i]);
		}
	}

	@Test
	public void testAnalyzePerColumnWithMultipleColumnsSecondExample() {
		int numberOfColumns = 17;
		char[] result = germanBreaker.getMostFrequentLetterPerColumn(plainTextFive.toCharArray(), numberOfColumns);
		assertEquals("wrong length", numberOfColumns, result.length);
		for (int i = 0; i < result.length; i++) {
			assertEquals("most frequent letter in german should be 'e'", 'e', result[i]);
		}
	}

	@Test
	public void testGetKeyWordFromCode() {
		String result = germanBreaker.getKeyWordFromCode(ciphertextOneFour);
		assertEquals("wrong Keyword", keywordOne, result);
	}

	@Test
	public void testGuessKeyWordLengthFromCodeSecondExample() {
		int guessedKeyWordLengh = germanBreaker.guessKeyWordLength(ciphertextTwoFive);
		assertEquals("wrong keyword length", keywordTwo.length(), guessedKeyWordLengh);
	}

	@Test
	public void testGetKeyWordFromCodeSecondExample() {
		String result = germanBreaker.getKeyWordFromCode(ciphertextTwoFive);
		assertEquals("wrong Keyword", keywordTwo, result);
	}

	@Test
	public void testGuessKeyWord() {
		String result = germanBreaker.guessKeyWord(ciphertextOneFour, keywordOne.length());
		assertEquals("wrong Keyword", keywordOne, result);
	}

	@Test
	public void testGuessKeyWordSecondExample() {
		String result = germanBreaker.guessKeyWord(ciphertextTwoFive, keywordTwo.length());
		assertEquals("wrong Keyword", keywordTwo, result);
	}

	@Test
	public void testGuessKeyWordDouble() {
		String result = germanBreaker.guessKeyWord(ciphertextOneFour, keywordOne.length() * 2);
		assertEquals("wrong Keyword", keywordOne + keywordOne, result);
	}

	@Test
	public void testGuessKeyWordTriple() {
		String result = germanBreaker.guessKeyWord(ciphertextOneFour, keywordOne.length() * 3);
		assertEquals("wrong Keyword", keywordOne + keywordOne + keywordOne, result);
	}

	@Test
	public void testGuessKeyWordLength() {
		int guessedKeyWordLengh = germanBreaker.guessKeyWordLength(ciphertextOneFour);
		assertEquals("guessedWrong", keywordOne.length(), guessedKeyWordLengh);
	}

	@Test
	public void testGuessKeyWordLengthFromCodeThirdExample() {
		int guessedKeyWordLengh = englishBreaker.guessKeyWordLength(ciphertextThreeSix);
		assertEquals("wrong keyword length", keywordThree.length(), guessedKeyWordLengh);
	}

	@Test
	public void testGetKeyWordFromCodeThirdExample() {
		String result = englishBreaker.getKeyWordFromCode(ciphertextThreeSix);
		assertEquals("wrong Keyword", "serret", result); // Well, close enough^^
	}

	@Test
	public void testGeneratePrimeNumbers() {
		List<Integer> primeNumbers = VigenereCodeBreaker.generatePrimeNumbers(100);
		Integer[] expectedResult = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,
				83, 89, 97 };
		assertEquals("wrong prime numbers", Arrays.asList(expectedResult), primeNumbers);
	}
}
