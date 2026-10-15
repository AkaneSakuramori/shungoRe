package q2;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f3885a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i4, char c5) {
        return i4 < str.length() && str.charAt(i4) == c5;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x0200  */
    /* JADX WARN: Instruction removed from duplicated block: B:101:0x0206, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x01e7, please report this as an issue */
    public static Date b(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i4;
        int iC;
        int i5;
        int iC2;
        int length;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int iC3 = c(index, i6, str);
            if (a(str, i6, '-')) {
                i6 = index + 5;
            }
            int i7 = i6 + 2;
            int iC4 = c(i6, i7, str);
            if (a(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int iC5 = c(i7, i8, str);
            boolean zA = a(str, i8, 'T');
            if (!zA && str.length() <= i8) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iC3, iC4 - 1, iC5);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i9 = i7 + 5;
                int iC6 = c(i7 + 3, i9, str);
                if (a(str, i9, ':')) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                int iC7 = c(i9, i10, str);
                if (a(str, i10, ':')) {
                    i10 = i9 + 3;
                }
                if (str.length() <= i10 || (cCharAt = str.charAt(i10)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i5 = iC7;
                    iC = 0;
                    iC2 = 0;
                    i8 = i10;
                    i4 = iC6;
                } else {
                    int i11 = i10 + 2;
                    iC2 = c(i10, i11, str);
                    if (iC2 > 59 && iC2 < 63) {
                        iC2 = 59;
                    }
                    if (a(str, i11, '.')) {
                        int i12 = i10 + 3;
                        int length2 = i10 + 4;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(length2);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i10 + 6);
                        iC = c(i12, iMin, str);
                        int i13 = iMin - i12;
                        if (i13 == 1) {
                            iC *= 100;
                        } else if (i13 == 2) {
                            iC *= 10;
                        }
                        i4 = iC6;
                        i8 = length2;
                        i5 = iC7;
                    } else {
                        i4 = iC6;
                        i8 = i11;
                        i5 = iC7;
                        iC = 0;
                    }
                }
            } else {
                i4 = 0;
                iC = 0;
                i5 = 0;
                iC2 = 0;
            }
            if (str.length() <= i8) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i8);
            TimeZone timeZone = f3885a;
            if (cCharAt3 == 'Z') {
                length = i8 + 1;
            } else {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i8);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i8 + strSubstring.length();
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str3 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str3);
                    String id = timeZone.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iC3);
            gregorianCalendar2.set(2, iC4 - 1);
            gregorianCalendar2.set(5, iC5);
            gregorianCalendar2.set(11, i4);
            gregorianCalendar2.set(12, i5);
            gregorianCalendar2.set(13, iC2);
            gregorianCalendar2.set(14, iC);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e5) {
            e = e5;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e7) {
            e = e7;
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int c(int i4, int i5, String str) {
        int i6;
        int i7;
        if (i4 < 0 || i5 > str.length() || i4 > i5) {
            throw new NumberFormatException(str);
        }
        if (i4 < i5) {
            i7 = i4 + 1;
            int iDigit = Character.digit(str.charAt(i4), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
            i6 = -iDigit;
        } else {
            i6 = 0;
            i7 = i4;
        }
        while (i7 < i5) {
            int i8 = i7 + 1;
            int iDigit2 = Character.digit(str.charAt(i7), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i4, i5));
            }
            i6 = (i6 * 10) - iDigit2;
            i7 = i8;
        }
        return -i6;
    }
}
