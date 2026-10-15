.class public final La4/k;
.super Lw3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:La4/t;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La4/t;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, La4/k;->e:I

    iput-object p2, p0, La4/k;->f:La4/t;

    iput-object p3, p0, La4/k;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lw3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    iget v0, p0, La4/k;->e:I

    const-wide/16 v1, -0x1

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, La4/k;->f:La4/t;

    iget-object v0, v0, La4/t;->c:La4/j;

    iget-object v3, p0, La4/k;->g:Ljava/lang/Object;

    check-cast v3, La4/b0;

    invoke-virtual {v0, v3}, La4/j;->b(La4/b0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v3, Lb4/l;->a:Lb4/l;

    sget-object v3, Lb4/l;->a:Lb4/l;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Http2Connection.Listener failure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, La4/k;->f:La4/t;

    iget-object v5, v5, La4/t;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    invoke-static {v4, v3, v0}, Lb4/l;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    :try_start_1
    iget-object v3, p0, La4/k;->g:Ljava/lang/Object;

    check-cast v3, La4/b0;

    sget-object v4, La4/b;->d:La4/b;

    invoke-virtual {v3, v4, v0}, La4/b0;->c(La4/b;Ljava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-wide v1

    :pswitch_0
    iget-object v0, p0, La4/k;->f:La4/t;

    iget-object v3, v0, La4/t;->c:La4/j;

    iget-object v4, p0, La4/k;->g:Ljava/lang/Object;

    check-cast v4, Lk3/m;

    iget-object v4, v4, Lk3/m;->b:Ljava/lang/Object;

    check-cast v4, La4/g0;

    invoke-virtual {v3, v0, v4}, La4/j;->a(La4/t;La4/g0;)V

    return-wide v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
