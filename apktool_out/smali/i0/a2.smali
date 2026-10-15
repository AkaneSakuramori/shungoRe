.class public Li0/a2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Li0/c2;


# instance fields
.field public final a:Li0/c2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/n0;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Le/n0;-><init>(I)V

    invoke-virtual {v0}, Le/n0;->v()Li0/c2;

    move-result-object v0

    iget-object v0, v0, Li0/c2;->a:Li0/a2;

    invoke-virtual {v0}, Li0/a2;->a()Li0/c2;

    move-result-object v0

    iget-object v0, v0, Li0/c2;->a:Li0/a2;

    invoke-virtual {v0}, Li0/a2;->b()Li0/c2;

    move-result-object v0

    iget-object v0, v0, Li0/c2;->a:Li0/a2;

    invoke-virtual {v0}, Li0/a2;->c()Li0/c2;

    move-result-object v0

    sput-object v0, Li0/a2;->b:Li0/c2;

    return-void
.end method

.method public constructor <init>(Li0/c2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0/a2;->a:Li0/c2;

    return-void
.end method


# virtual methods
.method public a()Li0/c2;
    .locals 1

    iget-object v0, p0, Li0/a2;->a:Li0/c2;

    return-object v0
.end method

.method public b()Li0/c2;
    .locals 1

    iget-object v0, p0, Li0/a2;->a:Li0/c2;

    return-object v0
.end method

.method public c()Li0/c2;
    .locals 1

    iget-object v0, p0, Li0/a2;->a:Li0/c2;

    return-object v0
.end method

.method public d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public e()Li0/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Li0/a2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Li0/a2;

    invoke-virtual {p0}, Li0/a2;->n()Z

    move-result v1

    invoke-virtual {p1}, Li0/a2;->n()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Li0/a2;->m()Z

    move-result v1

    invoke-virtual {p1}, Li0/a2;->m()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, Li0/a2;->j()Lb0/c;

    move-result-object v1

    invoke-virtual {p1}, Li0/a2;->j()Lb0/c;

    move-result-object v3

    invoke-static {v1, v3}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Li0/a2;->h()Lb0/c;

    move-result-object v1

    invoke-virtual {p1}, Li0/a2;->h()Lb0/c;

    move-result-object v3

    invoke-static {v1, v3}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Li0/a2;->e()Li0/j;

    move-result-object v1

    invoke-virtual {p1}, Li0/a2;->e()Li0/j;

    move-result-object p1

    invoke-static {v1, p1}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public f(I)Lb0/c;
    .locals 0

    sget-object p1, Lb0/c;->e:Lb0/c;

    return-object p1
.end method

.method public g()Lb0/c;
    .locals 1

    invoke-virtual {p0}, Li0/a2;->j()Lb0/c;

    move-result-object v0

    return-object v0
.end method

.method public h()Lb0/c;
    .locals 1

    sget-object v0, Lb0/c;->e:Lb0/c;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    invoke-virtual {p0}, Li0/a2;->n()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0}, Li0/a2;->m()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p0}, Li0/a2;->j()Lb0/c;

    move-result-object v2

    invoke-virtual {p0}, Li0/a2;->h()Lb0/c;

    move-result-object v3

    invoke-virtual {p0}, Li0/a2;->e()Li0/j;

    move-result-object v4

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lh0/b;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Lb0/c;
    .locals 1

    invoke-virtual {p0}, Li0/a2;->j()Lb0/c;

    move-result-object v0

    return-object v0
.end method

.method public j()Lb0/c;
    .locals 1

    sget-object v0, Lb0/c;->e:Lb0/c;

    return-object v0
.end method

.method public k()Lb0/c;
    .locals 1

    invoke-virtual {p0}, Li0/a2;->j()Lb0/c;

    move-result-object v0

    return-object v0
.end method

.method public l(IIII)Li0/c2;
    .locals 0

    sget-object p1, Li0/a2;->b:Li0/c2;

    return-object p1
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o([Lb0/c;)V
    .locals 0

    return-void
.end method

.method public p(Li0/c2;)V
    .locals 0

    return-void
.end method

.method public q(Lb0/c;)V
    .locals 0

    return-void
.end method
