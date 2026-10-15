.class public final Lc;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 1

    new-instance v0, Lc;

    invoke-direct {v0, p1}, Le3/g;-><init>(Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    new-instance p1, Lc;

    invoke-direct {p1, p2}, Le3/g;-><init>(Lc3/e;)V

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lc;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Ld3/a;->b:Ld3/a;

    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    sget-object p1, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {}, Ly2/d;->a()Ly2/m;

    move-result-object p1

    invoke-virtual {p1}, Lx2/d;->e()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
