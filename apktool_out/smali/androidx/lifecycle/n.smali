.class public final Landroidx/lifecycle/n;
.super Landroidx/lifecycle/f;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroidx/lifecycle/h0;->c:I

    invoke-static {p1}, Lf2/e;->A(Landroid/app/Activity;)V

    return-void
.end method
