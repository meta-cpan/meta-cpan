DESCRIPTION = "Class::Data::Inheritable is for creating accessor/mutators to class data. \
That is, if you want to store something about your class as a whole \
(instead of about a single object). This data is then inherited by your \
subclasses and can be overriden."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Data-Inheritable"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TM/TMTM/Class-Data-Inheritable-0.08.tar.gz"

SRC_URI[md5sum] = "fc0fe65926eb8fb932743559feb54eb9"
SRC_URI[sha256sum] = "9967feceea15227e442ec818723163eb6d73b8947e31f16ab806f6e2391af14a"

S = "${WORKDIR}/Class-Data-Inheritable-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
