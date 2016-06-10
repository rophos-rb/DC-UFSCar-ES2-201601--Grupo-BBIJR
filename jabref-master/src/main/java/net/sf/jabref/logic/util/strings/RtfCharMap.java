package net.sf.jabref.logic.util.strings;

import java.util.HashMap;


public class RtfCharMap extends HashMap<String, String> {
    public RtfCharMap() {


        put("`a", "\\'e0");
        put("`e", "\\'e8");
        put("`i", "\\'ec");
        put("`o", "\\'f2");
        put("`u", "\\'f9");
        put("?a", "\\'e1");
        put("?e", "\\'e9");
        put("?i", "\\'ed");
        put("?o", "\\'f3");
        put("?u", "\\'fa");
        put("^a", "\\'e2");
        put("^e", "\\'ea");
        put("^i", "\\'ee");
        put("^o", "\\'f4");
        put("^u", "\\'fa");
        put("\"a", "\\'e4");
        put("\"e", "\\'eb");
        put("\"i", "\\'ef");
        put("\"o", "\\'f6");
        put("\"u", "\\u252u");
        put("~n", "\\'f1");
        put("`A", "\\'c0");
        put("`E", "\\'c8");
        put("`I", "\\'cc");
        put("`O", "\\'d2");
        put("`U", "\\'d9");
        put("?A", "\\'c1");
        put("?E", "\\'c9");
        put("?I", "\\'cd");
        put("?O", "\\'d3");
        put("?U", "\\'da");
        put("^A", "\\'c2");
        put("^E", "\\'ca");
        put("^I", "\\'ce");
        put("^O", "\\'d4");
        put("^U", "\\'db");
        put("\"A", "\\'c4");
        put("\"E", "\\'cb");
        put("\"I", "\\'cf");
        put("\"O", "\\'d6");
        put("\"U", "\\'dc");

        // Use UNICODE characters for RTF-Chars which can not be found in the
        // standard codepage

        put("`A", "\\u192A"); // "Agrave"
        put("'A", "\\u193A"); // "Aacute"
        put("^A", "\\u194A"); // "Acirc"
        put("~A", "\\u195A"); // "Atilde"
        put("\"A", "\\u196A"); // "Auml"
        put("AA", "\\u197A"); // "Aring"
        // RTFCHARS.put("AE", "{\\uc2\\u198AE}"); // "AElig"
        put("AE", "{\\u198A}"); // "AElig"
        put("cC", "\\u199C"); // "Ccedil"
        put("`E", "\\u200E"); // "Egrave"
        put("'E", "\\u201E"); // "Eacute"
        put("^E", "\\u202E"); // "Ecirc"
        put("\"E", "\\u203E"); // "Euml"
        put("`I", "\\u204I"); // "Igrave
        put("'I", "\\u205I"); // "Iacute"
        put("^I", "\\u206I"); // "Icirc"
        put("\"I", "\\u207I"); // "Iuml"
        put("DH", "\\u208D"); // "ETH"
        put("~N", "\\u209N"); // "Ntilde"
        put("`O", "\\u210O"); // "Ograve"
        put("'O", "\\u211O"); // "Oacute"
        put("^O", "\\u212O"); // "Ocirc"
        put("~O", "\\u213O"); // "Otilde"
        put("\"O", "\\u214O"); // "Ouml"
        // According to ISO 8859-1 the "\times" symbol should be placed here
        // (#215).
        // Omitting this, because it is a mathematical symbol.
        put("O", "\\u216O"); // "Oslash"
        //  RTFCHARS.put("O", "\\'d8");
        put("o", "\\'f8");
        put("`U", "\\u217U"); // "Ugrave"
        put("'U", "\\u218U"); // "Uacute"
        put("^U", "\\u219U"); // "Ucirc"
        put("\"U", "\\u220U"); // "Uuml"
        put("'Y", "\\u221Y"); // "Yacute"
        put("TH", "{\\uc2\\u222TH}"); // "THORN"
        put("ss", "{\\uc2\\u223ss}"); // "szlig"
        //RTFCHARS.put("ss", "AFFEN"); // "szlig"
        put("`a", "\\u224a"); // "agrave"
        put("'a", "\\u225a"); // "aacute"
        put("^a", "\\u226a"); // "acirc"
        put("~a", "\\u227a"); // "atilde"
        put("\"a", "\\u228a"); // "auml"
        put("aa", "\\u229a"); // "aring"
        //  RTFCHARS.put("ae", "{\\uc2\\u230ae}"); // "aelig" \\u230e6
        put("ae", "{\\u230a}"); // "aelig" \\u230e6
        put("cc", "\\u231c"); // "ccedil"
        put("`e", "\\u232e"); // "egrave"
        put("'e", "\\u233e"); // "eacute"
        put("^e", "\\u234e"); // "ecirc"
        put("\"e", "\\u235e"); // "euml"
        put("`i", "\\u236i"); // "igrave"
        put("'i", "\\u237i"); // "iacute"
        put("^i", "\\u238i"); // "icirc"
        put("\"i", "\\u239i"); // "iuml"
        put("dh", "\\u240d"); // "eth"
        put("~n", "\\u241n"); // "ntilde"
        put("`o", "\\u242o"); // "ograve"
        put("'o", "\\u243o"); // "oacute"
        put("^o", "\\u244o"); // "ocirc"
        put("~o", "\\u245o"); // "otilde"
        put("\"o", "\\u246o"); // "ouml"
        // According to ISO 8859-1 the "\div" symbol should be placed here
        // (#247).
        // Omitting this, because it is a mathematical symbol.
        put("o", "\\u248o"); // "oslash"
        put("`u", "\\u249u"); // "ugrave"
        put("'u", "\\u250u"); // "uacute"
        put("^u", "\\u251u"); // "ucirc"
        // RTFCHARS.put("\"u", "\\u252"); // "uuml" exists in standard
// codepage
        put("'y", "\\u253y"); // "yacute"
        put("th", "{\\uc2\\u254th}"); // "thorn"
        put("\"y", "\\u255y"); // "yuml"

        put("=A", "\\u256A"); // "Amacr"
        put("=a", "\\u257a"); // "amacr"
        put("uA", "\\u258A"); // "Abreve"
        put("ua", "\\u259a"); // "abreve"
        put("kA", "\\u260A"); // "Aogon"
        put("ka", "\\u261a"); // "aogon"
        put("'C", "\\u262C"); // "Cacute"
        put("'c", "\\u263c"); // "cacute"
        put("^C", "\\u264C"); // "Ccirc"
        put("^c", "\\u265c"); // "ccirc"
        put(".C", "\\u266C"); // "Cdot"
        put(".c", "\\u267c"); // "cdot"
        put("vC", "\\u268C"); // "Ccaron"
        put("vc", "\\u269c"); // "ccaron"
        put("vD", "\\u270D"); // "Dcaron"
        // Symbol #271 (d) has no special Latex command
        put("DJ", "\\u272D"); // "Dstrok"
        put("dj", "\\u273d"); // "dstrok"
        put("=E", "\\u274E"); // "Emacr"
        put("=e", "\\u275e"); // "emacr"
        put("uE", "\\u276E"); // "Ebreve"
        put("ue", "\\u277e"); // "ebreve"
        put(".E", "\\u278E"); // "Edot"
        put(".e", "\\u279e"); // "edot"
        put("kE", "\\u280E"); // "Eogon"
        put("ke", "\\u281e"); // "eogon"
        put("vE", "\\u282E"); // "Ecaron"
        put("ve", "\\u283e"); // "ecaron"
        put("^G", "\\u284G"); // "Gcirc"
        put("^g", "\\u285g"); // "gcirc"
        put("uG", "\\u286G"); // "Gbreve"
        put("ug", "\\u287g"); // "gbreve"
        put(".G", "\\u288G"); // "Gdot"
        put(".g", "\\u289g"); // "gdot"
        put("cG", "\\u290G"); // "Gcedil"
        put("'g", "\\u291g"); // "gacute"
        put("^H", "\\u292H"); // "Hcirc"
        put("^h", "\\u293h"); // "hcirc"
        put("Hstrok", "\\u294H"); // "Hstrok"
        put("hstrok", "\\u295h"); // "hstrok"
        put("~I", "\\u296I"); // "Itilde"
        put("~i", "\\u297i"); // "itilde"
        put("=I", "\\u298I"); // "Imacr"
        put("=i", "\\u299i"); // "imacr"
        put("uI", "\\u300I"); // "Ibreve"
        put("ui", "\\u301i"); // "ibreve"
        put("kI", "\\u302I"); // "Iogon"
        put("ki", "\\u303i"); // "iogon"
        put(".I", "\\u304I"); // "Idot"
        put("i", "\\u305i"); // "inodot"
        // Symbol #306 (IJ) has no special Latex command
        // Symbol #307 (ij) has no special Latex command
        put("^J", "\\u308J"); // "Jcirc"
        put("^j", "\\u309j"); // "jcirc"
        put("cK", "\\u310K"); // "Kcedil"
        put("ck", "\\u311k"); // "kcedil"
        // Symbol #312 (k) has no special Latex command
        put("'L", "\\u313L"); // "Lacute"
        put("'l", "\\u314l"); // "lacute"
        put("cL", "\\u315L"); // "Lcedil"
        put("cl", "\\u316l"); // "lcedil"
        // Symbol #317 (L) has no special Latex command
        // Symbol #318 (l) has no special Latex command
        put("Lmidot", "\\u319L"); // "Lmidot"
        put("lmidot", "\\u320l"); // "lmidot"
        put("L", "\\u321L"); // "Lstrok"
        put("l", "\\u322l"); // "lstrok"
        put("'N", "\\u323N"); // "Nacute"
        put("'n", "\\u324n"); // "nacute"
        put("cN", "\\u325N"); // "Ncedil"
        put("cn", "\\u326n"); // "ncedil"
        put("vN", "\\u327N"); // "Ncaron"
        put("vn", "\\u328n"); // "ncaron"
        // Symbol #329 (n) has no special Latex command
        put("NG", "\\u330G"); // "ENG"
        put("ng", "\\u331g"); // "eng"
        put("=O", "\\u332O"); // "Omacr"
        put("=o", "\\u333o"); // "omacr"
        put("uO", "\\u334O"); // "Obreve"
        put("uo", "\\u335o"); // "obreve"
        put("HO", "\\u336?"); // "Odblac"
        put("Ho", "\\u337?"); // "odblac"
        put("OE", "{\\uc2\\u338OE}"); // "OElig"
        put("oe", "{\\uc2\\u339oe}"); // "oelig"
        put("'R", "\\u340R"); // "Racute"
        put("'r", "\\u341r"); // "racute"
        put("cR", "\\u342R"); // "Rcedil"
        put("cr", "\\u343r"); // "rcedil"
        put("vR", "\\u344R"); // "Rcaron"
        put("vr", "\\u345r"); // "rcaron"
        put("'S", "\\u346S"); // "Sacute"
        put("'s", "\\u347s"); // "sacute"
        put("^S", "\\u348S"); // "Scirc"
        put("^s", "\\u349s"); // "scirc"
        put("cS", "\\u350S"); // "Scedil"
        put("cs", "\\u351s"); // "scedil"
        put("vS", "\\u352S"); // "Scaron"
        put("vs", "\\u353s"); // "scaron"
        put("cT", "\\u354T"); // "Tcedil"
        put("ct", "\\u355t"); // "tcedil"
        put("vT", "\\u356T"); // "Tcaron"
        // Symbol #357 (t) has no special Latex command
        put("Tstrok", "\\u358T"); // "Tstrok"
        put("tstrok", "\\u359t"); // "tstrok"
        put("~U", "\\u360U"); // "Utilde"
        put("~u", "\\u361u"); // "utilde"
        put("=U", "\\u362U"); // "Umacr"
        put("=u", "\\u363u"); // "umacr"
        put("uU", "\\u364U"); // "Ubreve"
        put("uu", "\\u365u"); // "ubreve"
        put("rU", "\\u366U"); // "Uring"
        put("ru", "\\u367u"); // "uring"
        put("HU", "\\u368?"); // "Odblac"
        put("Hu", "\\u369?"); // "odblac"
        put("kU", "\\u370U"); // "Uogon"
        put("ku", "\\u371u"); // "uogon"
        put("^W", "\\u372W"); // "Wcirc"
        put("^w", "\\u373w"); // "wcirc"
        put("^Y", "\\u374Y"); // "Ycirc"
        put("^y", "\\u375y"); // "ycirc"
        put("\"Y", "\\u376Y"); // "Yuml"
        put("'Z", "\\u377Z"); // "Zacute"
        put("'z", "\\u378z"); // "zacute"
        put(".Z", "\\u379Z"); // "Zdot"
        put(".z", "\\u380z"); // "zdot"
        put("vZ", "\\u381Z"); // "Zcaron"
        put("vz", "\\u382z"); // "zcaron"
        // Symbol #383 (f) has no special Latex command
    }

}
