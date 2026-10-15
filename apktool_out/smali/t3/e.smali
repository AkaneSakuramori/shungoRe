.class public final Lt3/e;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Lt3/f;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lt3/f;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lt3/e;->c:I

    iput-object p1, p0, Lt3/e;->d:Lt3/f;

    iput-object p2, p0, Lt3/e;->e:Ljava/lang/Object;

    iput-object p3, p0, Lt3/e;->f:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lt3/e;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lt3/e;->b()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lt3/e;->b()Ljava/util/List;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/util/List;
    .locals 4

    iget v0, p0, Lt3/e;->c:I

    iget-object v1, p0, Lt3/e;->f:Ljava/lang/Object;

    iget-object v2, p0, Lt3/e;->e:Ljava/lang/Object;

    iget-object v3, p0, Lt3/e;->d:Lt3/f;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v3, Lt3/f;->b:Lc3/h;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    check-cast v2, Lt3/o;

    invoke-virtual {v2}, Lt3/o;->a()Ljava/util/List;

    move-result-object v2

    check-cast v1, Lt3/a;

    iget-object v1, v1, Lt3/a;->i:Lt3/s;

    iget-object v1, v1, Lt3/s;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lc3/h;->i0(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v3, Lt3/f;->b:Lc3/h;

    if-eqz v0, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/util/List;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, v3}, Lc3/h;->i0(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, La3/j;->R2(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v2, v3}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
