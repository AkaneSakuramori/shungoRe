.class public abstract Lf4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lf4/j;->e:Lf4/j;

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-static {v0}, La4/x;->k(Ljava/lang/String;)Lf4/j;

    move-result-object v0

    iget-object v0, v0, Lf4/j;->b:[B

    sput-object v0, Lf4/a;->a:[B

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    invoke-static {v0}, La4/x;->k(Ljava/lang/String;)Lf4/j;

    return-void
.end method
