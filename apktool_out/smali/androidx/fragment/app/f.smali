.class public final Landroidx/fragment/app/f;
.super Le/b0;
.source "SourceFile"


# instance fields
.field public c:Z

.field public d:Z

.field public e:Landroidx/fragment/app/x;


# virtual methods
.method public final h(Landroid/content/Context;)Landroidx/fragment/app/x;
    .locals 4

    iget-boolean v0, p0, Landroidx/fragment/app/f;->d:Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Landroidx/fragment/app/f;->e:Landroidx/fragment/app/x;

    return-object p1

    :cond_0
    iget-object v0, p0, Le/b0;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/c1;

    iget-object v1, v0, Landroidx/fragment/app/c1;->c:Landroidx/fragment/app/q;

    iget v0, v0, Landroidx/fragment/app/c1;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-boolean v2, p0, Landroidx/fragment/app/f;->c:Z

    invoke-static {p1, v1, v0, v2}, Lc3/h;->v1(Landroid/content/Context;Landroidx/fragment/app/q;ZZ)Landroidx/fragment/app/x;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/f;->e:Landroidx/fragment/app/x;

    iput-boolean v3, p0, Landroidx/fragment/app/f;->d:Z

    return-object p1
.end method
