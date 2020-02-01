package vigenere;

import static vigenere.Alphabet.*;

import org.junit.Assert;
import org.junit.Test;

import vigenere.VigenereCryptographer;

public final class VigenereCryptographerTest {
	private static String keywordOne = prepareText(ENGLISH, "Vignere");

	private static String plainTextOne = prepareText(GERMAN, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz���");
	private static String plainTextTwo = prepareText(GERMAN,
			"In vielen heutigen Geschichten passieren allerlei merkw�rdige Sachen.");
	private static String plainTextThree = prepareText(GERMAN,
			"Diese w�rden Sachen der ihm getreten, feindselig Buch und konnte Ihrem, Arbeitslose einer Angriff sich die. Vernetzung gelobt wieder Gl�ck wichtiger, zeigte bek�men der so vom und zu getreten, wenn war halb nach ersten, da� dem abseits zu einsehen verschwand in sprach einsehen dadurch Werten zustande allen, wie aber Nase gegenw�rtigen Woche, als von Rechte noch sozialen Franz weder geringe, sagte das die Raum Schemel mit. Lassen T�r au�er mit wollte sie. Man f�r man n�tig standen, noch er die hierbleiben wie irgendeine wenigen. Lassen fr�hen Arme sah zuversichtlich, wie und nicht bedeutend seine. Was versehen einer verleugnet es. Ich der f�r in f�r, denn Freunden Internet dem Kleidung. Nach der zug�nglich wurden zu sah, die Prozesse Staaten Reiben m�glich Software k�stlichen, wohl blo� andern m�ssen einem seine, die und er technische ihm, Schnallen wieder bei ihr seinem. Die erfasste her aufatmend Unterschied unternehmerisch, und schien war ist die, tats�chlich hatte der nur pl�tzlich laut. Die als alte ein die und, wenn hatte war wieder Stock mit. eine Blick sich war sagen ausdehnende hier zusammen sich mitlachen Kamins, sagte zog in sie es. Lassen mit hip dann dazu das. Besonders Sarah und ging und. Dies des schmuddelig das Internet verlie� mit, allgemeinen unternehmerisch aus wieder eines Lage speisten. Er weltpolitische Falten meisten noch ausdehnende Zigarette. Nach von an nicht gewesen Faktor, blieb gleich Schlimmste neigte einer, und Kultur ihm langen sie sa� das beinahe Jahr, als Betriebe wird Tage Hand und, und wild nicht bleiche diesem in, was Tode ihnen auch eines Kriterien, besonders auf war Absage und so er einer, knochiges eines Biergenusses weder B�rse ganz zuvor. Er des werden Kohlen nun wagte ist. Wollen Jahre Ankunft als und gef�hrt einer Vorschrift hoffe, Porzellan dadurch Kleidung von aufnahm fl�sterte, dessen Bewegungen dem ihr Thomas. B�ser irgendeine platzen Frau Michael einer, so nicht k��te k�nnen Unwillk�rlich Atmens. Man f�r planlos er geben mit Markus Unternehmen Mann halten glauben sa�, es beteiligt k�nnen Netzwelten hatten beherrschte. Sofort nach an sterben einem, so selbst auch veranstaltet Kommunikation Haferschleim Wesen Internet. Aber pensioniert starke ziemlich war die Hat wollte Gesellschaft. Dies auch wahr erm�glichten aufgeheitertes, entschlossen eintrat ausreichend mit deshalb Blatt handeln sich. Ihr die Armenhauses ein lautstarken. Ich miteinander Vorgang er mit Sachen Namens, die Erinnerung so die eigentlich infolgedessen hatte war, die au�er mit die da� beobachtete, Kommunikation Widerspruch lie� Zimmer sozialen sich. Das Ausruf erfahren zu des, schaute hat nahm gesprungen verlebt, es Vorstellungen und beim die. Das das Gewohnheit ber�hmtes geschehen bald Ausdruck, den gro�er kommen den f�r. Jung sein noch Freundlichkeit nicht. F�r die ihn wollte jetzt es weit begreifend, als n�tig Internet setzte ausgerungen, dessen alte Hungern wenig Werten an. Besonders zwar jung Zigarette meisten Methoden nun, es traditionelle Tag eigentlich die endlich, aber Existenz f�r von B�rsenwerte er heute, dann gesagt sprechen mit weitere er den er zu setzte ohnm�chtig, es Bewegung W�chters gehen fr�hen. Olaf das man Profite Frau. Von m�glich Spa� als und, entschlossen den sich f�r nichts, sah Zimmervermieterin Fr�hst�ck als ihm.");

	private static String ciphertextOneOne = "vjiqiwkcqpxpdrjxwewkyqedldrfxlkskymesrzrftlzygymasgfnifipm";
	private static String ciphertextOneTwo = prepareText(ENGLISH,
			"Dv bvicii pkhxzkzv Mrwtldkngie tvayviiii iryiipzq srvbapmxqmxi Niiuie.");
	private static String ciphertextOneThree = prepareText(ENGLISH,
			"Yqkfi nyzzjrr Jexpka hvv dps tikvzbka, jvmilyrpzk Wciu yeh fwtaxv Mczkz, Eifzqzfpfwz moaii Eioxvjw wdkn qmv. Zzztrxqyio mrpffo eorhvv Btargb adkngmxim, hkvkki wmqnidii lke wf zju aah qy bmzeikii, ekar nem pgyf eexp kewkii, lgfw uih ihfizxn ha rmewzpka zvvnknjeeh dv ycvrgc moawvlzv jnhlvxp Crvkii hafxrrym gypvr, rqk nfvv Iiyr kvkzvcniixdoka Afgcm, gyw msi Zkplki iwiu wfddirrr Wvvvf jiuim okemekz, agtxv hva jvi Iepu Yplvqzt svx. Cenaka Xlim iafwvv hqz jscpom yvi. Dei narv dei vurxzk nbgahvr, iwiu ii hdm nviifgmooie adm oekvrymoai niiqmrr. Cenaka jiyzpka Eiqz agu dlzzzyvgyxgqiu, azi pvj amtlo jkqilxzvj fizrz. Egf zvvnmnrr vmimx iiipzcmaik in. Qiu hvv acke me jpmx, qier Azkhruii Qtgiirzb jrq Bpzqjhrx. Rvkn qii dpogrrxpdkn jyihzv fh wrl, yqk Cvfdzayr Wkevbka Vvmwmt zsvkgqiu Wfjoegei bszazymtlzv, cblc fgwyf eehzzt zyvwnmt rmeih akvrv, hdm aah vv omiurzwxpk vld, Wxptnpcii eorhvv wmo vli wzqtrq. Umz mxsejwom nrv ryaizzieh Pvzrvjgcqkq yexzztrldimqypl, lry aiumvr rix vwk hdm, znxjezknymtl cizgi uim vae tcszbfymtl giag. Hzi vty npki zqt qmv yil, crre lvbzr arv rqkqii Wowix qzx. zqtr Fcmxs yvgy avz ynkvr vcyqiyrzvjr lzim hafedqzv yvgy qdbrngyii Sgzmew, nimgi qsb qt fmv in. Tgfwvr hqz umg hvvt qeqy yiy. Oijsilkew Jemin hru kdvm hru. Hdmy qij wxpshhuigqm qej Mibkervx qmxymvwn uog, ecpbmsrmeii ctgiirzpsrvzwxp ghw nmzlke izrza Rnkv wkmofxvr. Zz crpktjtogmjgcm Lnpkii ukvwkii vupl rynlkurvrym Fvkrvzbzr. Rrgc dua ee rdkng kvazaka Jroowx, opziw orrmtl Nknymdqnbk aizkom kvrvv, pvj Xycxpz ouq ceioka wzi niyf hrw wmoaeyi Eine, ecw Wmzemvfz eoeh Kebm Nnru yil, aah nmgl tvgyx wtkvgyi yqkfid mi, egf Xfhz qnaie epkn rmein Sxvxvvdmt, oijsilkew rya ege Eswvok hru wj mx rmeim, stbgymbmy rmein Jorvxiicyfij azlke Ffimak teed ucbbv. Vv ymy jiihzv Qblcii vaa arkom ofx. Nsgtka Nrlmm Gaolrab gyw lry oksyvlmb kvrvv Qwxfgyvdnz uswjz, Xuedvpgit qeuymkn Xpvmyctt zfr vclaeyq atarwkimbk, qijwzv Hravkpvmrr uih qne Xyshiy. Osvwzz oekvrymoai gpvbfrr Wvvc Svgyezt kvrvv, nw tvgyx fckfwki fwkarvr Pvcvpcopmxymtl Vbsrrj. Qvv lhii tgitysj im okoie qdb Snvbyn Ctgiirzpsrr Deiv nnpkii ornysii agfw, vw wmzrmcmbb qbierzv Trxqaztzrr yeobka fvlzzxfgyxz. Aussix iiiu ee womxoie idvkz, wf wzthfx ryxp brvrrnbgyxvx Fwszyemfizvse Lvnkewtlgmoz Avwzv Oaxvvimz. Nfvv kmtfmfrdmxg wkemsk mmvqgqiu arv yqk Uek ajtrgi Xinmrywtlvnz. Qmvw vciu arlm mxzsvkgqiuxvr vcltiyidbkexvw, zvzfgypjayrr vmibxnx rynzkvgyiil svx uinpgyf Spvbz ueehztt fmtl. Dpx qmv Emukalrynmy rme pvczfxrvfmt. Vgy qdbkvrrrymx Isikvvm rv dmo Agplvr Iisrrj, hdm Kemerzzaak js yqk rmxiibrvgy minuykvhzayrr yeobk jei, hdm ghwjim uog hzi yiyf fvswiiuxvxz, Suzqlrdsggmfr Rqjrvjtmciu pzina Fvqdim aummrpzv yvgy. Hva Ghwiya mxseyvzv fh hvw, nknnyki ciz aeyq bmycvlrbmt iiipzjz, rw Msmazrpcyioka yeh wmoz hzi. Yiy qej Kzeuuryidb hrvlicuzrw xinknrlvr wirq Elwyzapo, uii oxbwjim suzqvr ymt syvv. Ectt wvmi vupl Wvzctqpzgcskvx emxpz. Syvv yqk vle ajtrgi aiohz rw nidb hrkiidnkah, rpn vurxzk Dvzrveio akgdki vcytiiyioka, hvwnmt npki Ccttiir rmtvk Nimbka ee. Fzauahvvn hcnv ayio Fvkrvzbzr qvmnbka Qvxcwjrr eyi, my gvrhdbobrvpgm Znk vmbmtgpzgc lor iehgqiu, esim Mdvwkiih lhii zjv Hbiiwzvcrvki zz nryki, yita kvwvoz ftiixpka qzx rmogiii zz jrr vv uc yrxqxz wnaqrixpzvk, vw Wmcrklrb Egrgyxzzy tiyii nxhiyii. Wrnj uen uga Tisaqzr Jiep. Dua qfibtopl Jtvay npj yil, kaxjgctufwvr ymt fmtl acke rzgcby, fey Ddusrvmimuorxvvdv Leyvlnbargb ega ouq.");

	@Test
	public void testEncipherOneOne() {
		VigenereCryptographer crypt = new VigenereCryptographer(keywordOne);
		String ciphertext = crypt.encipherText(plainTextOne);
		Assert.assertEquals("Wrong length", ciphertextOneOne.length(), ciphertext.length());
		Assert.assertEquals("Wrong coding", ciphertextOneOne, ciphertext);
	}

	@Test
	public void testEncipherOneTwo() {
		VigenereCryptographer crypt = new VigenereCryptographer(keywordOne);
		String ciphertext = crypt.encipherText(plainTextTwo);
		Assert.assertEquals("Wrong length", ciphertextOneTwo.length(), ciphertext.length());
		Assert.assertEquals("Wrong coding", ciphertextOneTwo, ciphertext);
	}

	@Test
	public void testEncipherOneThree() {
		VigenereCryptographer crypt = new VigenereCryptographer(keywordOne);
		String ciphertext = crypt.encipherText(plainTextThree);
		Assert.assertEquals("Wrong length", ciphertextOneThree.length(), ciphertext.length());
		Assert.assertEquals("Wrong coding", ciphertextOneThree, ciphertext);
	}
}
