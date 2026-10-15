.class public final Landroidx/emoji2/text/g;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final synthetic j:Landroidx/emoji2/text/h;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/emoji2/text/g;->j:Landroidx/emoji2/text/h;

    return-void
.end method


# virtual methods
.method public final E1(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Landroidx/emoji2/text/g;->j:Landroidx/emoji2/text/h;

    iget-object v0, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/emoji2/text/m;

    invoke-virtual {v0, p1}, Landroidx/emoji2/text/m;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final K1(Lg/h;)V
    .locals 5

    iget-object v0, p0, Landroidx/emoji2/text/g;->j:Landroidx/emoji2/text/h;

    iput-object p1, v0, Landroidx/emoji2/text/h;->e:Lg/h;

    new-instance p1, Landroidx/emoji2/text/s;

    iget-object v1, v0, Landroidx/emoji2/text/h;->e:Lg/h;

    new-instance v2, Lf2/e;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lf2/e;-><init>(I)V

    iget-object v3, v0, Le/n0;->c:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Landroidx/emoji2/text/m;

    iget-object v4, v4, Landroidx/emoji2/text/m;->h:Landroidx/emoji2/text/f;

    check-cast v3, Landroidx/emoji2/text/m;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p1, v1, v2, v4}, Landroidx/emoji2/text/s;-><init>(Lg/h;Lf2/e;Landroidx/emoji2/text/f;)V

    iput-object p1, v0, Landroidx/emoji2/text/h;->d:Landroidx/emoji2/text/s;

    iget-object p1, v0, Le/n0;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/emoji2/text/m;

    invoke-virtual {p1}, Landroidx/emoji2/text/m;->e()V

    return-void
.end method
