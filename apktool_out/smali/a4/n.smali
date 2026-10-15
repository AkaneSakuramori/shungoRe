.class public final La4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final b:La4/w;

.field public final synthetic c:La4/t;


# direct methods
.method public constructor <init>(La4/t;La4/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/n;->c:La4/t;

    iput-object p2, p0, La4/n;->b:La4/w;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, La4/n;->c:La4/t;

    iget-object v1, p0, La4/n;->b:La4/w;

    sget-object v2, La4/b;->e:La4/b;

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v1, p0}, La4/w;->e(La4/n;)V

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v1, v4, p0}, La4/w;->a(ZLa4/n;)Z

    move-result v4

    if-nez v4, :cond_0

    sget-object v4, La4/b;->c:La4/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v2, La4/b;->h:La4/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0, v4, v2, v3}, La4/t;->a(La4/b;La4/b;Ljava/io/IOException;)V

    :goto_0
    invoke-static {v1}, Lu3/b;->c(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception v5

    goto :goto_3

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v5

    move-object v4, v2

    goto :goto_3

    :catch_1
    move-exception v3

    move-object v4, v2

    :goto_1
    :try_start_2
    sget-object v2, La4/b;->d:La4/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0, v2, v2, v3}, La4/t;->a(La4/b;La4/b;Ljava/io/IOException;)V

    goto :goto_0

    :goto_2
    sget-object v0, Lz2/f;->a:Lz2/f;

    return-object v0

    :goto_3
    invoke-virtual {v0, v4, v2, v3}, La4/t;->a(La4/b;La4/b;Ljava/io/IOException;)V

    invoke-static {v1}, Lu3/b;->c(Ljava/io/Closeable;)V

    throw v5
.end method
