.class public final Lw2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lt3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lt3/u;->c:Ljava/util/regex/Pattern;

    const-string v0, "application/json"

    invoke-static {v0}, Lf2/e;->r(Ljava/lang/String;)Lt3/u;

    move-result-object v0

    sput-object v0, Lw2/d;->a:Lt3/u;

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lc3/e;)Ljava/lang/Object;
    .locals 10

    new-instance v7, Lc3/m;

    invoke-static {p5}, Lc3/h;->k1(Lc3/e;)Lc3/e;

    move-result-object p5

    invoke-direct {v7, p5}, Lc3/m;-><init>(Lc3/e;)V

    const-string p5, "Authenticated request: "

    invoke-virtual {p5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    const-string v0, "Shungo"

    invoke-static {v0, p5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p5, Lt3/v;

    invoke-direct {p5}, Lt3/v;-><init>()V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "unit"

    invoke-static {v1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v2, 0x3c

    invoke-static {v2, v3, v1}, Lu3/b;->b(JLjava/util/concurrent/TimeUnit;)I

    move-result v1

    iput v1, p5, Lt3/v;->s:I

    new-instance v3, Lt3/w;

    invoke-direct {v3, p5}, Lt3/w;-><init>(Lt3/v;)V

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p5

    const-string v1, "android_id"

    invoke-static {p5, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    const/4 v1, 0x0

    if-nez p5, :cond_0

    const-string v2, "Error no device id"

    const/4 v4, 0x0

    invoke-static {p0, v2, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    invoke-virtual {v7, v1}, Lc3/m;->b(Ljava/lang/Object;)V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "query: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f0f001e

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "?device="

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Lf1/a;

    const p5, 0x7f0f0032

    invoke-virtual {p0, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string v0, "getString(...)"

    invoke-static {p5, v0}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x7f0f0033

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v0}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p5, v2}, Lf1/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p5, Lg1/b;

    invoke-direct {p5, p2}, Lg1/b;-><init>(Lf1/a;)V

    new-instance p2, Lh1/c;

    new-instance v0, Lh1/e;

    invoke-direct {v0, p0}, Lh1/e;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, p5, v0}, Lh1/c;-><init>(Lg1/b;Lh1/e;)V

    const-string p5, "com.auth0.access_token"

    invoke-virtual {v0, p5}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    const-string v2, "com.auth0.refresh_token"

    invoke-virtual {v0, v2}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "com.auth0.id_token"

    invoke-virtual {v0, v4}, Lh1/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v0, v0, Lh1/e;->a:Landroid/content/SharedPreferences;

    const-string v5, "com.auth0.expires_at"

    invoke-interface {v0, v5}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v6

    const-wide/16 v8, 0x0

    if-nez v6, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v5, v8, v9}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_4

    :cond_2
    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {p2, v4, v5, v8, v9}, Lh1/a;->a(JJ)Z

    move-result p5

    if-eqz p5, :cond_5

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    invoke-virtual {v7, v1}, Lc3/m;->b(Ljava/lang/Object;)V

    :cond_5
    :goto_2
    new-instance p5, Lw2/c;

    move-object v0, p5

    move-object v1, p1

    move-object v2, p3

    move-object v4, p4

    move-object v5, v7

    move-object v6, p0

    invoke-direct/range {v0 .. v6}, Lw2/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lt3/w;Ljava/lang/Boolean;Lc3/m;Landroid/content/Context;)V

    new-instance p0, Lh1/b;

    invoke-direct {p0, p2, p5}, Lh1/b;-><init>(Lh1/c;Li1/a;)V

    iget-object p1, p2, Lh1/c;->d:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v7}, Lc3/m;->a()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Ld3/a;->b:Ld3/a;

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc3/e;I)Ljava/lang/Object;
    .locals 6

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p5, 0x8

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object v3, v0

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p5, 0x10

    if-eqz p2, :cond_2

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object v4, p2

    goto :goto_1

    :cond_2
    move-object v4, v0

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lw2/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lc3/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
