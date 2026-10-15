.class public final Lu2/a;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public f:I

.field public final synthetic g:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lu2/a;->g:Landroid/content/Context;

    invoke-direct {p0, p2}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 2

    new-instance v0, Lu2/a;

    iget-object v1, p0, Lu2/a;->g:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lu2/a;-><init>(Landroid/content/Context;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lu2/a;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lu2/a;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lu2/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Ld3/a;->b:Ld3/a;

    iget v1, p0, Lu2/a;->f:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    sget-object p1, Lw2/d;->a:Lt3/u;

    iget-object v3, p0, Lu2/a;->g:Landroid/content/Context;

    const-string v4, "/api/shungo/stop"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v8, 0x1c

    iput v2, p0, Lu2/a;->f:I

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Lw2/d;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc3/e;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lw2/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stop attempt: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_3

    new-instance v1, Ljava/lang/Integer;

    iget p1, p1, Lw2/a;->b:I

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method
