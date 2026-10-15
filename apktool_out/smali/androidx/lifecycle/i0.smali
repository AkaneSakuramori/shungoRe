.class public final Landroidx/lifecycle/i0;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/l;


# static fields
.field public static final c:Landroidx/lifecycle/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/i0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk3/g;-><init>(I)V

    sput-object v0, Landroidx/lifecycle/i0;->c:Landroidx/lifecycle/i0;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lu0/b;

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/m0;

    invoke-direct {p1}, Landroidx/lifecycle/m0;-><init>()V

    return-object p1
.end method
