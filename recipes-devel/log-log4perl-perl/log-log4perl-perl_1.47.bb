DESCRIPTION = "Log::Log4perl lets you remote-control and fine-tune the logging behaviour \
of your system from the outside. It implements the widely popular \
(Java-based) Log4j logging package in pure Perl."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Log-Log4perl"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MS/MSCHILLI/Log-Log4perl-1.47.tar.gz"

SRC_URI[md5sum] = "53a0a2e68da51fa445c3557e4852d3a4"
SRC_URI[sha256sum] = "9001dded011226538b9a50c7856815bb0dba72a1e6218fdcaba56f651356b96f"

S = "${WORKDIR}/Log-Log4perl-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
