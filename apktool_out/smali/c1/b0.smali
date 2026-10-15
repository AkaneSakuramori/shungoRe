.class public abstract Lc1/b0;
.super Lc1/a0;
.source "SourceFile"


# static fields
.field public static g:Z = true


# virtual methods
.method public l(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, Lc1/b0;->g:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Landroidx/lifecycle/e0;->l(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Lc1/b0;->g:Z

    :cond_0
    :goto_0
    return-void
.end method
