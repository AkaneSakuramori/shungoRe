.class public final Lf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lt3/s;

.field public final c:Lm1/a;

.field public final d:Lk1/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/a;->a:Ljava/lang/String;

    new-instance p1, Lk1/a;

    invoke-direct {p1}, Lk1/a;-><init>()V

    iput-object p1, p0, Lf1/a;->d:Lk1/a;

    invoke-static {p2}, Lf1/a;->a(Ljava/lang/String;)Lt3/s;

    move-result-object p1

    iput-object p1, p0, Lf1/a;->b:Lt3/s;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lf1/a;->a(Ljava/lang/String;)Lt3/s;

    new-instance p1, Lm1/a;

    invoke-direct {p1}, Lm1/a;-><init>()V

    iput-object p1, p0, Lf1/a;->c:Lm1/a;

    return-void

    :cond_0
    const/4 p1, 0x1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Invalid domain url: \'%s\'"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(format, *args)"

    invoke-static {p1, p2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static a(Ljava/lang/String;)Lt3/s;
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v2, "ROOT"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v1, v2}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "http://"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_2

    const-string p0, "https://"

    invoke-static {v1, p0, v3}, Lq3/l;->o3(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    sget-object p0, Lt3/s;->j:[C

    const-string p0, "<this>"

    invoke-static {v1, p0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, Lf2/e;->q(Ljava/lang/String;)Lt3/s;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0

    :cond_2
    const-string v0, "Invalid domain url: \'"

    const-string v1, "\'. Only HTTPS domain URLs are supported. If no scheme is passed, HTTPS will be used."

    invoke-static {v0, p0, v1}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
