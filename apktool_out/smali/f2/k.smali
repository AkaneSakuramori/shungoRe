.class public final Lf2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc3/h;

.field public b:Lc3/h;

.field public c:Lc3/h;

.field public d:Lc3/h;

.field public e:Lf2/c;

.field public f:Lf2/c;

.field public g:Lf2/c;

.field public h:Lf2/c;

.field public i:Lf2/e;

.field public j:Lf2/e;

.field public k:Lf2/e;

.field public l:Lf2/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf2/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf2/k;->a:Lc3/h;

    new-instance v0, Lf2/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf2/k;->b:Lc3/h;

    new-instance v0, Lf2/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf2/k;->c:Lc3/h;

    new-instance v0, Lf2/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lf2/k;->d:Lc3/h;

    new-instance v0, Lf2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/a;-><init>(F)V

    iput-object v0, p0, Lf2/k;->e:Lf2/c;

    new-instance v0, Lf2/a;

    invoke-direct {v0, v1}, Lf2/a;-><init>(F)V

    iput-object v0, p0, Lf2/k;->f:Lf2/c;

    new-instance v0, Lf2/a;

    invoke-direct {v0, v1}, Lf2/a;-><init>(F)V

    iput-object v0, p0, Lf2/k;->g:Lf2/c;

    new-instance v0, Lf2/a;

    invoke-direct {v0, v1}, Lf2/a;-><init>(F)V

    iput-object v0, p0, Lf2/k;->h:Lf2/c;

    invoke-static {}, Lc3/h;->z0()Lf2/e;

    move-result-object v0

    iput-object v0, p0, Lf2/k;->i:Lf2/e;

    invoke-static {}, Lc3/h;->z0()Lf2/e;

    move-result-object v0

    iput-object v0, p0, Lf2/k;->j:Lf2/e;

    invoke-static {}, Lc3/h;->z0()Lf2/e;

    move-result-object v0

    iput-object v0, p0, Lf2/k;->k:Lf2/e;

    invoke-static {}, Lc3/h;->z0()Lf2/e;

    move-result-object v0

    iput-object v0, p0, Lf2/k;->l:Lf2/e;

    return-void
.end method

.method public static b(Lc3/h;)V
    .locals 1

    instance-of v0, p0, Lf2/j;

    if-eqz v0, :cond_0

    check-cast p0, Lf2/j;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p0, Lf2/d;

    if-eqz v0, :cond_1

    check-cast p0, Lf2/d;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lf2/l;
    .locals 2

    new-instance v0, Lf2/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lf2/k;->a:Lc3/h;

    iput-object v1, v0, Lf2/l;->a:Lc3/h;

    iget-object v1, p0, Lf2/k;->b:Lc3/h;

    iput-object v1, v0, Lf2/l;->b:Lc3/h;

    iget-object v1, p0, Lf2/k;->c:Lc3/h;

    iput-object v1, v0, Lf2/l;->c:Lc3/h;

    iget-object v1, p0, Lf2/k;->d:Lc3/h;

    iput-object v1, v0, Lf2/l;->d:Lc3/h;

    iget-object v1, p0, Lf2/k;->e:Lf2/c;

    iput-object v1, v0, Lf2/l;->e:Lf2/c;

    iget-object v1, p0, Lf2/k;->f:Lf2/c;

    iput-object v1, v0, Lf2/l;->f:Lf2/c;

    iget-object v1, p0, Lf2/k;->g:Lf2/c;

    iput-object v1, v0, Lf2/l;->g:Lf2/c;

    iget-object v1, p0, Lf2/k;->h:Lf2/c;

    iput-object v1, v0, Lf2/l;->h:Lf2/c;

    iget-object v1, p0, Lf2/k;->i:Lf2/e;

    iput-object v1, v0, Lf2/l;->i:Lf2/e;

    iget-object v1, p0, Lf2/k;->j:Lf2/e;

    iput-object v1, v0, Lf2/l;->j:Lf2/e;

    iget-object v1, p0, Lf2/k;->k:Lf2/e;

    iput-object v1, v0, Lf2/l;->k:Lf2/e;

    iget-object v1, p0, Lf2/k;->l:Lf2/e;

    iput-object v1, v0, Lf2/l;->l:Lf2/e;

    return-object v0
.end method
