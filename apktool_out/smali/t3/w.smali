.class public final Lt3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final A:Ljava/util/List;

.field public static final B:Ljava/util/List;


# instance fields
.field public final b:Lt3/l;

.field public final c:Lc/a;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Ll0/b;

.field public final g:Z

.field public final h:Lt3/n;

.field public final i:Z

.field public final j:Z

.field public final k:Lt3/n;

.field public final l:Lt3/n;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Lt3/n;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Le4/c;

.field public final u:Lt3/f;

.field public final v:Lc3/h;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:Lc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lt3/x;->f:Lt3/x;

    sget-object v1, Lt3/x;->d:Lt3/x;

    filled-new-array {v0, v1}, [Lt3/x;

    move-result-object v0

    invoke-static {v0}, Lu3/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lt3/w;->A:Ljava/util/List;

    sget-object v0, Lt3/i;->e:Lt3/i;

    sget-object v1, Lt3/i;->f:Lt3/i;

    filled-new-array {v0, v1}, [Lt3/i;

    move-result-object v0

    invoke-static {v0}, Lu3/b;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lt3/w;->B:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lt3/v;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lt3/v;->a:Lt3/l;

    iput-object v0, p0, Lt3/w;->b:Lt3/l;

    iget-object v0, p1, Lt3/v;->b:Lc/a;

    iput-object v0, p0, Lt3/w;->c:Lc/a;

    iget-object v0, p1, Lt3/v;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Lu3/b;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lt3/w;->d:Ljava/util/List;

    iget-object v0, p1, Lt3/v;->d:Ljava/util/ArrayList;

    invoke-static {v0}, Lu3/b;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lt3/w;->e:Ljava/util/List;

    iget-object v0, p1, Lt3/v;->e:Ll0/b;

    iput-object v0, p0, Lt3/w;->f:Ll0/b;

    iget-boolean v0, p1, Lt3/v;->f:Z

    iput-boolean v0, p0, Lt3/w;->g:Z

    iget-object v0, p1, Lt3/v;->g:Lt3/n;

    iput-object v0, p0, Lt3/w;->h:Lt3/n;

    iget-boolean v0, p1, Lt3/v;->h:Z

    iput-boolean v0, p0, Lt3/w;->i:Z

    iget-boolean v0, p1, Lt3/v;->i:Z

    iput-boolean v0, p0, Lt3/w;->j:Z

    iget-object v0, p1, Lt3/v;->j:Lt3/n;

    iput-object v0, p0, Lt3/w;->k:Lt3/n;

    iget-object v0, p1, Lt3/v;->k:Lt3/n;

    iput-object v0, p0, Lt3/w;->l:Lt3/n;

    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ld4/a;->a:Ld4/a;

    :cond_0
    iput-object v0, p0, Lt3/w;->m:Ljava/net/ProxySelector;

    iget-object v0, p1, Lt3/v;->l:Lt3/n;

    iput-object v0, p0, Lt3/w;->n:Lt3/n;

    iget-object v0, p1, Lt3/v;->m:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lt3/w;->o:Ljavax/net/SocketFactory;

    iget-object v0, p1, Lt3/v;->n:Ljava/util/List;

    iput-object v0, p0, Lt3/w;->r:Ljava/util/List;

    iget-object v1, p1, Lt3/v;->o:Ljava/util/List;

    iput-object v1, p0, Lt3/w;->s:Ljava/util/List;

    iget-object v1, p1, Lt3/v;->p:Le4/c;

    iput-object v1, p0, Lt3/w;->t:Le4/c;

    iget v1, p1, Lt3/v;->r:I

    iput v1, p0, Lt3/w;->w:I

    iget v1, p1, Lt3/v;->s:I

    iput v1, p0, Lt3/w;->x:I

    iget v1, p1, Lt3/v;->t:I

    iput v1, p0, Lt3/w;->y:I

    new-instance v1, Lc/a;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Lc/a;-><init>(I)V

    iput-object v1, p0, Lt3/w;->z:Lc/a;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt3/i;

    iget-boolean v1, v1, Lt3/i;->a:Z

    if-eqz v1, :cond_2

    sget-object v0, Lb4/l;->a:Lb4/l;

    sget-object v0, Lb4/l;->a:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->n()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Lt3/w;->q:Ljavax/net/ssl/X509TrustManager;

    sget-object v1, Lb4/l;->a:Lb4/l;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lb4/l;->m(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, Lt3/w;->p:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v1, Lb4/l;->a:Lb4/l;

    invoke-virtual {v1, v0}, Lb4/l;->b(Ljavax/net/ssl/X509TrustManager;)Lc3/h;

    move-result-object v0

    iput-object v0, p0, Lt3/w;->v:Lc3/h;

    iget-object p1, p1, Lt3/v;->q:Lt3/f;

    invoke-static {v0}, Lc3/h;->X(Ljava/lang/Object;)V

    iget-object v1, p1, Lt3/f;->b:Lc3/h;

    invoke-static {v1, v0}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v1, Lt3/f;

    iget-object p1, p1, Lt3/f;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, Lt3/f;-><init>(Ljava/util/Set;Lc3/h;)V

    move-object p1, v1

    :goto_0
    iput-object p1, p0, Lt3/w;->u:Lt3/f;

    goto :goto_2

    :cond_4
    :goto_1
    iput-object v2, p0, Lt3/w;->p:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v2, p0, Lt3/w;->v:Lc3/h;

    iput-object v2, p0, Lt3/w;->q:Ljavax/net/ssl/X509TrustManager;

    sget-object p1, Lt3/f;->c:Lt3/f;

    iput-object p1, p0, Lt3/w;->u:Lt3/f;

    :goto_2
    iget-object p1, p0, Lt3/w;->d:Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    invoke-static {p1, v0}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_10

    iget-object p1, p0, Lt3/w;->e:Ljava/util/List;

    invoke-static {p1, v0}, Lc3/h;->Y(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_f

    iget-object p1, p0, Lt3/w;->r:Ljava/util/List;

    instance-of v0, p1, Ljava/util/Collection;

    iget-object v1, p0, Lt3/w;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v2, p0, Lt3/w;->v:Lc3/h;

    iget-object v3, p0, Lt3/w;->p:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt3/i;

    iget-boolean v0, v0, Lt3/i;->a:Z

    if-eqz v0, :cond_6

    if-eqz v3, :cond_9

    if-eqz v2, :cond_8

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_3
    const-string p1, "Check failed."

    if-nez v3, :cond_e

    if-nez v2, :cond_d

    if-nez v1, :cond_c

    iget-object v0, p0, Lt3/w;->u:Lt3/f;

    sget-object v1, Lt3/f;->c:Lt3/f;

    invoke-static {v0, v1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    :goto_4
    return-void

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
