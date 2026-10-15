.class public final Ly2/g;
.super Ly2/c;
.source "SourceFile"


# instance fields
.field public final r:Z

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly2/c;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/g;->r:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly2/g;->s:Z

    invoke-static {}, Ly2/e;->a()Ly2/e;

    move-result-object v0

    iput-object v0, p0, Ly2/c;->l:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final S2()Lc3/h;
    .locals 3

    sget-object v0, Ly2/h;->l:Ly2/h;

    :try_start_0
    invoke-static {}, Ly2/d;->a()Ly2/m;

    move-result-object v1

    iput-object v1, p0, Ly2/c;->n:Ly2/m;
    :try_end_0
    .catch Lx2/a; {:try_start_0 .. :try_end_0} :catch_0

    iget-boolean v2, p0, Ly2/g;->r:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lx2/d;->e()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ly2/c;->close()V

    return-object v0

    :cond_0
    iget-object v0, p0, Ly2/c;->l:Ljava/util/List;

    instance-of v0, v0, Ly2/e;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ly2/c;->l:Ljava/util/List;

    :cond_1
    invoke-virtual {p0}, Ly2/c;->Q2()Ly2/h;

    move-result-object v0

    iget-boolean v1, p0, Ly2/g;->s:Z

    if-eqz v1, :cond_2

    sget-object v1, Ly2/h;->m:Ly2/h;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly2/g;->s:Z

    invoke-virtual {p0}, Ly2/g;->S2()Lc3/h;

    move-result-object v0

    :cond_2
    return-object v0

    :catch_0
    invoke-virtual {p0}, Ly2/c;->close()V

    return-object v0
.end method
