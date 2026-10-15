.class public final Landroidx/lifecycle/k0;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/a;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Landroidx/lifecycle/k0;->c:I

    iput-object p2, p0, Landroidx/lifecycle/k0;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Landroidx/lifecycle/k0;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Landroidx/lifecycle/k0;->b()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Landroidx/lifecycle/k0;->b()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {p0}, Landroidx/lifecycle/k0;->b()Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/k0;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/r0;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt3/p;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lt3/p;-><init>(I)V

    sget-object v3, Lk3/n;->a:Lk3/o;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lk3/c;

    const-class v4, Landroidx/lifecycle/m0;

    invoke-direct {v3, v4}, Lk3/c;-><init>(Ljava/lang/Class;)V

    iget-object v5, v1, Lt3/p;->a:Ljava/util/ArrayList;

    new-instance v6, Lu0/e;

    invoke-interface {v3}, Lk3/b;->a()Ljava/lang/Class;

    move-result-object v3

    const-string v7, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>"

    invoke-static {v3, v7}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v6, v3}, Lu0/e;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lu0/c;

    iget-object v1, v1, Lt3/p;->a:Ljava/util/ArrayList;

    new-array v2, v2, [Lu0/e;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lu0/e;

    array-length v2, v1

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lu0/e;

    invoke-direct {v3, v1}, Lu0/c;-><init>([Lu0/e;)V

    new-instance v1, Le/c;

    invoke-direct {v1, v0, v3}, Le/c;-><init>(Landroidx/lifecycle/r0;Lu0/c;)V

    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    invoke-virtual {v1, v4, v0}, Le/c;->a(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/n0;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/m0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/util/List;
    .locals 4

    iget v0, p0, Landroidx/lifecycle/k0;->c:I

    iget-object v1, p0, Landroidx/lifecycle/k0;->d:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lx3/l;

    iget-object v0, v1, Lx3/l;->e:Lt3/o;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lt3/o;->a()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0}, La3/j;->R2(Ljava/lang/Iterable;)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v2, v3}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1

    :pswitch_0
    :try_start_0
    check-cast v1, Lj3/a;

    invoke-interface {v1}, Lj3/a;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sget-object v0, La3/p;->b:La3/p;

    :goto_1
    return-object v0

    :pswitch_1
    check-cast v1, Ljava/util/List;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
