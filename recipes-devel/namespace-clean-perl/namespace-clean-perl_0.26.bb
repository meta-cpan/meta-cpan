DESCRIPTION = "Keeping packages clean When you define a function, or import one, into \
a Perl package, it will naturally also be available as a method. This does \
not per se cause problems, but it can complicate subclassing and, for \
example, plugin classes that are included via multiple inheritance by \
loading them as base classes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-clean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RI/RIBASUSHI/namespace-clean-0.26.tar.gz"

SRC_URI[md5sum] = "c4f65abbc0916814c4c27dbf20d6d086"
SRC_URI[sha256sum] = "73986e19c4ad0e634e35f4f26e81437f152d8026eb1d91fe795725746ce13eca"
RDEPENDS_${PN} += "b-hooks-endofscope-perl"
RDEPENDS_${PN} += "package-stash-perl"

S = "${WORKDIR}/namespace-clean-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
