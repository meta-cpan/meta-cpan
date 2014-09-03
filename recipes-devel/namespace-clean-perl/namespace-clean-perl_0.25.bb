DESCRIPTION = "Keeping packages clean When you define a function, or import one, into \
a Perl package, it will \
naturally also be available as a method. This does not per se cause \
problems, but it can complicate subclassing and, for example, plugin \
classes \
that are included via multiple inheritance by loading them as base \
classes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-clean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RI/RIBASUSHI/namespace-clean-0.25.tar.gz"

SRC_URI[md5sum] = "da81d44f114a947b873f8df11a3c02ec"
SRC_URI[sha256sum] = "946a2b7b8219562818867ad915cd493637e2639f901db050b835500c8e6ecd04"
RDEPENDS_${PN} += "b-hooks-endofscope-perl"
RDEPENDS_${PN} += "package-stash-perl"

S = "${WORKDIR}/namespace-clean-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
