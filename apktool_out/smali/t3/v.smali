.class public final Lt3/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lt3/l;

.field public final b:Lc/a;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ll0/b;

.field public final f:Z

.field public final g:Lt3/n;

.field public final h:Z

.field public final i:Z

.field public final j:Lt3/n;

.field public final k:Lt3/n;

.field public final l:Lt3/n;

.field public final m:Ljavax/net/SocketFactory;

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/List;

.field public final p:Le4/c;

.field public final q:Lt3/f;

.field public r:I

.field public s:I

.field public final t:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt3/l;

    invoke-direct {v0}, Lt3/l;-><init>()V

    iput-object v0, p0, Lt3/v;->a:Lt3/l;

    new-instance v0, Lc/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lc/a;-><init>(I)V

    iput-object v0, p0, Lt3/v;->b:Lc/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt3/v;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lt3/v;->d:Ljava/util/ArrayList;

    sget-object v0, Lt3/n;->d:Lt3/n;

    sget-object v1, Lu3/b;->a:[B

    new-instance v1, Ll0/b;

    invoke-direct {v1, v0}, Ll0/b;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lt3/v;->e:Ll0/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt3/v;->f:Z

    sget-object v1, Lt3/b;->a:Lt3/n;

    iput-object v1, p0, Lt3/v;->g:Lt3/n;

    iput-boolean v0, p0, Lt3/v;->h:Z

    iput-boolean v0, p0, Lt3/v;->i:Z

    sget-object v0, Lt3/k;->b:Lt3/n;

    iput-object v0, p0, Lt3/v;->j:Lt3/n;

    sget-object v0, Lt3/m;->c:Lt3/n;

    iput-object v0, p0, Lt3/v;->k:Lt3/n;

    iput-object v1, p0, Lt3/v;->l:Lt3/n;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault()"

    invoke-static {v0, v1}, Lc3/h;->a0(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lt3/v;->m:Ljavax/net/SocketFactory;

    sget-object v0, Lt3/w;->B:Ljava/util/List;

    iput-object v0, p0, Lt3/v;->n:Ljava/util/List;

    sget-object v0, Lt3/w;->A:Ljava/util/List;

    iput-object v0, p0, Lt3/v;->o:Ljava/util/List;

    sget-object v0, Le4/c;->a:Le4/c;

    iput-object v0, p0, Lt3/v;->p:Le4/c;

    sget-object v0, Lt3/f;->c:Lt3/f;

    iput-object v0, p0, Lt3/v;->q:Lt3/f;

    const/16 v0, 0x2710

    iput v0, p0, Lt3/v;->r:I

    iput v0, p0, Lt3/v;->s:I

    iput v0, p0, Lt3/v;->t:I

    return-void
.end method
