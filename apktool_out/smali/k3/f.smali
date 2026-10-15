.class public abstract Lk3/f;
.super Lk3/a;
.source "SourceFile"

# interfaces
.implements Lk3/e;
.implements Lo3/c;


# instance fields
.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(Landroidx/activity/z;)V
    .locals 6

    const-class v2, Landroidx/activity/z;

    const-string v3, "updateEnabledCallbacks"

    const-string v4, "updateEnabledCallbacks()V"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lk3/a;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    const/4 p1, 0x0

    iput p1, p0, Lk3/f;->h:I

    iput p1, p0, Lk3/f;->i:I

    return-void
.end method


# virtual methods
.method public final c()Lo3/a;
    .locals 1

    sget-object v0, Lk3/n;->a:Lk3/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lk3/f;->h:I

    return v0
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lk3/f;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lk3/f;

    iget-object v1, p1, Lk3/a;->e:Ljava/lang/String;

    iget-object v3, p0, Lk3/a;->e:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lk3/a;->f:Ljava/lang/String;

    iget-object v3, p1, Lk3/a;->f:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lk3/f;->i:I

    iget v3, p1, Lk3/f;->i:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lk3/f;->h:I

    iget v3, p1, Lk3/f;->h:I

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lk3/a;->c:Ljava/lang/Object;

    iget-object v3, p1, Lk3/a;->c:Ljava/lang/Object;

    invoke-static {v1, v3}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lk3/a;->b()Lk3/b;

    move-result-object v1

    invoke-virtual {p1}, Lk3/a;->b()Lk3/b;

    move-result-object p1

    invoke-static {v1, p1}, Lc3/h;->I(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :cond_2
    instance-of v0, p1, Lo3/c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lk3/a;->b:Lo3/a;

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lk3/f;->c()Lo3/a;

    iput-object p0, p0, Lk3/a;->b:Lo3/a;

    move-object v0, p0

    :cond_3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    return v2
.end method

.method public final bridge synthetic equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lk3/f;->e(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()I
    .locals 2

    invoke-virtual {p0}, Lk3/a;->b()Lk3/b;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lk3/a;->b()Lk3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    :goto_0
    iget-object v1, p0, Lk3/a;->e:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lk3/a;->f:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lk3/a;->b:Lo3/a;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk3/f;->c()Lo3/a;

    iput-object p0, p0, Lk3/a;->b:Lo3/a;

    move-object v0, p0

    :cond_0
    if-eq v0, p0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "<init>"

    iget-object v1, p0, Lk3/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "constructor (Kotlin reflection is not available)"

    goto :goto_0

    :cond_2
    const-string v0, "function "

    const-string v2, " (Kotlin reflection is not available)"

    invoke-static {v0, v1, v2}, La;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final bridge synthetic hashCode()I
    .locals 1

    invoke-virtual {p0}, Lk3/f;->f()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk3/f;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
