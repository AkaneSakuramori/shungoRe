.class public abstract Lc1/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc1/c0;

.field public static final b:Lc1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x3

    if-lt v0, v1, :cond_0

    new-instance v0, Lc1/d0;

    invoke-direct {v0, v2}, Lz0/c;-><init>(I)V

    sput-object v0, Lc1/y;->a:Lc1/c0;

    goto :goto_0

    :cond_0
    new-instance v0, Lc1/c0;

    invoke-direct {v0, v2}, Lz0/c;-><init>(I)V

    sput-object v0, Lc1/y;->a:Lc1/c0;

    :goto_0
    new-instance v0, Lc1/c;

    const/4 v1, 0x5

    const-class v2, Ljava/lang/Float;

    const-string v3, "translationAlpha"

    invoke-direct {v0, v2, v3, v1}, Lc1/c;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lc1/y;->b:Lc1/c;

    new-instance v0, Lc1/c;

    const/4 v1, 0x6

    const-class v2, Landroid/graphics/Rect;

    const-string v3, "clipBounds"

    invoke-direct {v0, v2, v3, v1}, Lc1/c;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Landroid/view/View;IIII)V
    .locals 6

    sget-object v0, Lc1/y;->a:Lc1/c0;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lc1/b0;->l(Landroid/view/View;IIII)V

    return-void
.end method
