.class public final Ly0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Ly0/k;


# direct methods
.method public synthetic constructor <init>(Ly0/k;Ljava/util/ArrayList;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Ly0/e;->b:I

    iput-object p1, p0, Ly0/e;->d:Ly0/k;

    iput-object p2, p0, Ly0/e;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v0, p0

    iget v1, v0, Ly0/e;->b:I

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    iget-object v11, v0, Ly0/e;->d:Ly0/k;

    iget-object v12, v0, Ly0/e;->c:Ljava/util/ArrayList;

    packed-switch v1, :pswitch_data_0

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ly0/d1;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v6, Ly0/d1;->a:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v8

    iget-object v2, v11, Ly0/k;->o:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    iget-wide v4, v11, Ly0/l0;->c:J

    invoke-virtual {v2, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v10, Ly0/f;

    const/4 v9, 0x1

    move-object v4, v10

    move-object v5, v11

    invoke-direct/range {v4 .. v9}, Ly0/f;-><init>(Ly0/k;Ljava/lang/Object;Landroid/view/View;Landroid/view/ViewPropertyAnimator;I)V

    invoke-virtual {v2, v10}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v11, Ly0/k;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, Ly0/i;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v10, Ly0/i;->a:Ly0/d1;

    const/4 v5, 0x0

    if-nez v4, :cond_1

    move-object v8, v5

    goto :goto_2

    :cond_1
    iget-object v4, v4, Ly0/d1;->a:Landroid/view/View;

    move-object v8, v4

    :goto_2
    iget-object v4, v10, Ly0/i;->b:Ly0/d1;

    if-eqz v4, :cond_2

    iget-object v4, v4, Ly0/d1;->a:Landroid/view/View;

    move-object v13, v4

    goto :goto_3

    :cond_2
    move-object v13, v5

    :goto_3
    iget-object v14, v11, Ly0/k;->r:Ljava/util/ArrayList;

    iget-wide v6, v11, Ly0/l0;->f:J

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    iget-object v4, v10, Ly0/i;->a:Ly0/d1;

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, v10, Ly0/i;->e:I

    iget v5, v10, Ly0/i;->c:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v9, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    iget v4, v10, Ly0/i;->f:I

    iget v5, v10, Ly0/i;->d:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v9, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    invoke-virtual {v9, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v15

    new-instance v5, Ly0/h;

    const/16 v16, 0x0

    move-object v4, v5

    move-object v3, v5

    move-object v5, v11

    move-wide/from16 v17, v6

    move-object v6, v10

    move-object v7, v9

    move/from16 v9, v16

    invoke-direct/range {v4 .. v9}, Ly0/h;-><init>(Ly0/k;Ly0/i;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v15, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_4

    :cond_3
    move-wide/from16 v17, v6

    :goto_4
    if-eqz v13, :cond_4

    invoke-virtual {v13}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    iget-object v3, v10, Ly0/i;->b:Ly0/d1;

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    move-wide/from16 v4, v17

    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-virtual {v3, v14}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    new-instance v15, Ly0/h;

    const/4 v9, 0x1

    move-object v4, v15

    move-object v5, v11

    move-object v6, v10

    move-object v8, v13

    invoke-direct/range {v4 .. v9}, Ly0/h;-><init>(Ly0/k;Ly0/i;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v3, v15}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_5

    :cond_4
    const/high16 v14, 0x3f800000    # 1.0f

    :goto_5
    move v3, v14

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v11, Ly0/k;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_1
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly0/j;

    iget-object v6, v3, Ly0/j;->a:Ly0/d1;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v6, Ly0/d1;->a:Landroid/view/View;

    iget v4, v3, Ly0/j;->d:I

    iget v5, v3, Ly0/j;->b:I

    sub-int v7, v4, v5

    iget v4, v3, Ly0/j;->e:I

    iget v3, v3, Ly0/j;->c:I

    sub-int v9, v4, v3

    if-eqz v7, :cond_6

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    :cond_6
    if-eqz v9, :cond_7

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v10

    iget-object v3, v11, Ly0/k;->p:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v3, v11, Ly0/l0;->e:J

    invoke-virtual {v10, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    new-instance v13, Ly0/g;

    move-object v4, v13

    move-object v5, v11

    invoke-direct/range {v4 .. v10}, Ly0/g;-><init>(Ly0/k;Ly0/d1;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v3, v13}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v11, Ly0/k;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
