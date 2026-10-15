package u;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f4560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SparseArray f4561b;

    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:85:0x013c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        byte b5;
        n nVar = new n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlResourceParser.getAttributeName(i4);
            String attributeValue = xmlResourceParser.getAttributeValue(i4);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    int eventType = xmlResourceParser.getEventType();
                    i iVarD = null;
                    while (eventType != 1) {
                        if (eventType == 0) {
                            xmlResourceParser.getName();
                        } else if (eventType == 2) {
                            switch (xmlResourceParser.getName()) {
                                case "Constraint":
                                    iVarD = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                case "ConstraintOverride":
                                    iVarD = n.d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                case "Guideline":
                                    iVarD = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVarD.f4577d.f4581a = true;
                                    break;
                                case "Barrier":
                                    iVarD = n.d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    iVarD.f4577d.f4596h0 = 1;
                                    break;
                                case "PropertySet":
                                    if (iVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarD.f4575b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Transform":
                                    if (iVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarD.f4578e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Layout":
                                    if (iVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarD.f4577d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "Motion":
                                    if (iVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    iVarD.f4576c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                    break;
                                case "CustomAttribute":
                                case "CustomMethod":
                                    if (iVarD == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    b.a(context, xmlResourceParser, iVarD.f4579f);
                                    break;
                                    break;
                            }
                        } else if (eventType == 3) {
                            String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                            switch (lowerCase.hashCode()) {
                                case -2075718416:
                                    if (lowerCase.equals("guideline")) {
                                        b5 = 3;
                                    } else {
                                        b5 = -1;
                                    }
                                    break;
                                case -190376483:
                                    if (lowerCase.equals("constraint")) {
                                        b5 = 1;
                                    } else {
                                        b5 = -1;
                                    }
                                    break;
                                case 426575017:
                                    if (lowerCase.equals("constraintoverride")) {
                                        b5 = 2;
                                    } else {
                                        b5 = -1;
                                    }
                                    break;
                                case 2146106725:
                                    if (lowerCase.equals("constraintset")) {
                                        b5 = 0;
                                    } else {
                                        b5 = -1;
                                    }
                                    break;
                                default:
                                    b5 = -1;
                                    break;
                            }
                            if (b5 == 0) {
                                this.f4561b.put(identifier, nVar);
                                return;
                            } else if (b5 == 1 || b5 == 2 || b5 == 3) {
                                nVar.f4655c.put(Integer.valueOf(iVarD.f4574a), iVarD);
                                iVarD = null;
                            }
                        }
                        eventType = xmlResourceParser.next();
                    }
                } catch (IOException e5) {
                    e5.printStackTrace();
                } catch (XmlPullParserException e6) {
                    e6.printStackTrace();
                }
                this.f4561b.put(identifier, nVar);
                return;
            }
        }
    }
}
