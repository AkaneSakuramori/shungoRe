.class public abstract Li0/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li0/c2;

.field public b:[Lb0/c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, Li0/c2;

    invoke-direct {v0}, Li0/c2;-><init>()V

    invoke-direct {p0, v0}, Li0/t1;-><init>(Li0/c2;)V

    return-void
.end method

.method public constructor <init>(Li0/c2;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/t1;->a:Li0/c2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Li0/t1;->b:[Lb0/c;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, Lc3/h;->j1(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, Li0/t1;->b:[Lb0/c;

    const/4 v3, 0x2

    invoke-static {v3}, Lc3/h;->j1(I)I

    move-result v4

    aget-object v2, v2, v4

    iget-object v4, p0, Li0/t1;->a:Li0/c2;

    if-nez v2, :cond_0

    iget-object v2, v4, Li0/c2;->a:Li0/a2;

    invoke-virtual {v2, v3}, Li0/a2;->f(I)Lb0/c;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, v4, Li0/c2;->a:Li0/a2;

    invoke-virtual {v0, v1}, Li0/a2;->f(I)Lb0/c;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, Lb0/c;->a(Lb0/c;Lb0/c;)Lb0/c;

    move-result-object v0

    invoke-virtual {p0, v0}, Li0/t1;->g(Lb0/c;)V

    iget-object v0, p0, Li0/t1;->b:[Lb0/c;

    const/16 v1, 0x10

    invoke-static {v1}, Lc3/h;->j1(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Li0/t1;->f(Lb0/c;)V

    :cond_2
    iget-object v0, p0, Li0/t1;->b:[Lb0/c;

    const/16 v1, 0x20

    invoke-static {v1}, Lc3/h;->j1(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Li0/t1;->d(Lb0/c;)V

    :cond_3
    iget-object v0, p0, Li0/t1;->b:[Lb0/c;

    const/16 v1, 0x40

    invoke-static {v1}, Lc3/h;->j1(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Li0/t1;->h(Lb0/c;)V

    :cond_4
    return-void
.end method

.method public abstract b()Li0/c2;
.end method

.method public c(ILb0/c;)V
    .locals 3

    iget-object v0, p0, Li0/t1;->b:[Lb0/c;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [Lb0/c;

    iput-object v0, p0, Li0/t1;->b:[Lb0/c;

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x100

    if-gt v0, v1, :cond_2

    and-int v1, p1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Li0/t1;->b:[Lb0/c;

    invoke-static {v0}, Lc3/h;->j1(I)I

    move-result v2

    aput-object p2, v1, v2

    :goto_1
    shl-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public d(Lb0/c;)V
    .locals 0

    return-void
.end method

.method public abstract e(Lb0/c;)V
.end method

.method public f(Lb0/c;)V
    .locals 0

    return-void
.end method

.method public abstract g(Lb0/c;)V
.end method

.method public h(Lb0/c;)V
    .locals 0

    return-void
.end method
