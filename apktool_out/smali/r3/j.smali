.class public final Lr3/j;
.super Lc3/b;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    sget-object p1, Lc3/f;->b:Lc3/f;

    sget-object v0, Lr3/i;->d:Lr3/i;

    .line 3
    invoke-direct {p0, p1, v0}, Lc3/b;-><init>(Lc3/j;Lr3/i;)V

    return-void

    .line 4
    :cond_0
    sget-object p1, Lr3/k;->c:Lr3/j;

    sget-object v0, Lr3/i;->e:Lr3/i;

    .line 5
    invoke-direct {p0, p1, v0}, Lc3/b;-><init>(Lc3/j;Lr3/i;)V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    const/4 p2, 0x1

    if-eq p1, p2, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-direct {p0, p1}, Lr3/j;-><init>(I)V

    return-void

    .line 2
    :cond_0
    invoke-direct {p0, p2}, Lr3/j;-><init>(I)V

    return-void
.end method
