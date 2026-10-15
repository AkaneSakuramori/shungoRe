.class public abstract Lq3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq3/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/f;

    const-string v1, "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*"

    invoke-direct {v0, v1}, Lq3/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq3/g;->a:Lq3/f;

    return-void
.end method
