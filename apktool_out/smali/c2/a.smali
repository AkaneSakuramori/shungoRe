.class public final Lc2/a;
.super Lc3/h;
.source "SourceFile"


# instance fields
.field public final j:Landroid/graphics/Typeface;

.field public final k:Le/n0;

.field public l:Z


# direct methods
.method public constructor <init>(Le/n0;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc2/a;->j:Landroid/graphics/Typeface;

    iput-object p1, p0, Lc2/a;->k:Le/n0;

    return-void
.end method


# virtual methods
.method public final G1(I)V
    .locals 1

    iget-boolean p1, p0, Lc2/a;->l:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lc2/a;->k:Le/n0;

    iget-object p1, p1, Le/n0;->c:Ljava/lang/Object;

    check-cast p1, Lz1/b;

    iget-object v0, p0, Lc2/a;->j:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Lz1/b;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lz1/b;->h(Z)V

    :cond_0
    return-void
.end method

.method public final I1(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, Lc2/a;->l:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lc2/a;->k:Le/n0;

    iget-object p2, p2, Le/n0;->c:Ljava/lang/Object;

    check-cast p2, Lz1/b;

    invoke-virtual {p2, p1}, Lz1/b;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lz1/b;->h(Z)V

    :cond_0
    return-void
.end method
