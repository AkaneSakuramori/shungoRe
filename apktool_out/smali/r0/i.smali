.class public final Lr0/i;
.super Lf2/e;
.source "SourceFile"


# instance fields
.field public final d:Lr0/h;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lf2/e;-><init>(I)V

    new-instance v0, Lr0/h;

    invoke-direct {v0, p1}, Lr0/h;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lr0/i;->d:Lr0/h;

    return-void
.end method


# virtual methods
.method public final L(Z)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/m;->j:Landroidx/emoji2/text/m;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lr0/i;->d:Lr0/h;

    invoke-virtual {v0, p1}, Lr0/h;->L(Z)V

    return-void
.end method

.method public final O(Z)V
    .locals 2

    sget-object v0, Landroidx/emoji2/text/m;->j:Landroidx/emoji2/text/m;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    iget-object v1, p0, Lr0/i;->d:Lr0/h;

    if-eqz v0, :cond_1

    iput-boolean p1, v1, Lr0/h;->f:Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, Lr0/h;->O(Z)V

    :goto_1
    return-void
.end method

.method public final u([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 2

    sget-object v0, Landroidx/emoji2/text/m;->j:Landroidx/emoji2/text/m;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, Lr0/i;->d:Lr0/h;

    invoke-virtual {v0, p1}, Lr0/h;->u([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method
