.class public final Lb;
.super Le3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# instance fields
.field public final synthetic f:Le;


# direct methods
.method public constructor <init>(Le;Lc3/e;)V
    .locals 0

    iput-object p1, p0, Lb;->f:Le;

    invoke-direct {p0, p2}, Le3/g;-><init>(Lc3/e;)V

    return-void
.end method


# virtual methods
.method public final a(Lc3/e;)Lc3/e;
    .locals 2

    new-instance v0, Lb;

    iget-object v1, p0, Lb;->f:Le;

    invoke-direct {v0, v1, p1}, Lb;-><init>(Le;Lc3/e;)V

    return-object v0
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr3/o;

    check-cast p2, Lc3/e;

    invoke-virtual {p0, p2}, Lb;->a(Lc3/e;)Lc3/e;

    move-result-object p1

    check-cast p1, Lb;

    sget-object p2, Lz2/f;->a:Lz2/f;

    invoke-virtual {p1, p2}, Lb;->h(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2
.end method

.method public final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Ld3/a;->b:Ld3/a;

    invoke-static {p1}, Lc3/h;->D2(Ljava/lang/Object;)V

    iget-object p1, p0, Lb;->f:Le;

    iget-object p1, p1, Le;->a:Landroid/content/Context;

    invoke-static {p1}, Lc3/h;->B2(Landroid/content/Context;)V

    sget-object p1, Lz2/f;->a:Lz2/f;

    return-object p1
.end method
