.class public final Lw2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/lang/Boolean;

.field public final synthetic b:Lc3/e;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lc3/e;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/b;->a:Ljava/lang/Boolean;

    iput-object p2, p0, Lw2/b;->b:Lc3/e;

    iput-object p3, p0, Lw2/b;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lx3/j;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "Shungo"

    const-string v0, "HTTP request error !"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Lw2/b;->b:Lc3/e;

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lc3/e;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lx3/j;Lt3/b0;)V
    .locals 3

    iget-object p1, p0, Lw2/b;->a:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iget-object v0, p2, Lt3/b0;->h:Lt3/d0;

    const/4 v1, 0x0

    if-nez p1, :cond_3

    const/16 p1, 0xc8

    iget v2, p2, Lt3/b0;->e:I

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    const-string p1, "data.json"

    iget-object v2, p0, Lw2/b;->c:Landroid/content/Context;

    invoke-static {v2, v0, p1}, Lc3/h;->p2(Landroid/content/Context;Lt3/d0;Ljava/lang/String;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to download file: response body is null"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    if-eqz v0, :cond_7

    move-object p1, v0

    check-cast p1, Lt3/c0;

    iget-object p1, p1, Lt3/c0;->d:Lf4/i;

    :try_start_0
    check-cast v0, Lt3/c0;

    iget v2, v0, Lt3/c0;->b:I

    iget-object v0, v0, Lt3/c0;->e:Ljava/lang/Object;

    packed-switch v2, :pswitch_data_0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_4

    sget-object v2, Lt3/u;->c:Ljava/util/regex/Pattern;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {v0}, Lf2/e;->r(Ljava/lang/String;)Lt3/u;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    :cond_4
    move-object v0, v1

    goto :goto_2

    :pswitch_0
    :try_start_2
    check-cast v0, Lt3/u;

    :goto_2
    if-eqz v0, :cond_5

    sget-object v2, Lq3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v2}, Lt3/u;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    if-nez v0, :cond_6

    :cond_5
    sget-object v0, Lq3/a;->a:Ljava/nio/charset/Charset;

    :cond_6
    invoke-static {p1, v0}, Lu3/b;->r(Lf4/i;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-interface {p1, v0}, Lf4/i;->y(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {p1, v1}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move-object v1, v0

    goto :goto_3

    :catchall_0
    move-exception p2

    :try_start_3
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_7
    :goto_3
    new-instance p1, Lw2/a;

    invoke-direct {p1, v1, p2}, Lw2/a;-><init>(Ljava/lang/String;Lt3/b0;)V

    iget-object p2, p0, Lw2/b;->b:Lc3/e;

    invoke-interface {p2, p1}, Lc3/e;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
