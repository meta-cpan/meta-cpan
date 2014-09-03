DESCRIPTION = "Magic is Perl's way of enhancing variables. This mechanism lets the \
user add extra data to any variable and hook syntactical operations \
(such as access, \
assignment or destruction) that can be applied to it. With this module, \
you \
can add your own magic to any variable without having to write a single \
line \
of XS."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Variable-Magic"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/V/VP/VPIT/Variable-Magic-0.53.tar.gz"

SRC_URI[md5sum] = "4f59fb9c08a3432e04cdda6b5c4a339d"
SRC_URI[sha256sum] = "18fd97b913b383df0c8f1e91cabe82bfc450d7aec8d5f62f9d015884cf7abed7"

S = "${WORKDIR}/Variable-Magic-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
