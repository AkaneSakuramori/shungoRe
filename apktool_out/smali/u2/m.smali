.class public final Lu2/m;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/l;


# static fields
.field public static final c:Lu2/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu2/m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk3/g;-><init>(I)V

    sput-object v0, Lu2/m;->c:Lu2/m;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq3/a;->a:Ljava/nio/charset/Charset;

    const-string v1, "charset"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    :try_start_0
    invoke-static {v1}, Lc3/h;->d2(Ljava/io/InputStreamReader;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, p1}, Lc3/h;->k0(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
